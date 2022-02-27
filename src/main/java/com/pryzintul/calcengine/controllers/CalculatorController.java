package com.pryzintul.calcengine.controllers;

import com.pryzintul.calcengine.services.CalculatorService;
import io.zeebe.client.ZeebeClient;
import io.zeebe.client.ZeebeClientBuilder;
import io.zeebe.client.api.worker.JobClient;
import io.zeebe.client.impl.ZeebeClientImpl;
import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.pryzintul.calcengine.dtos.CalculationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;

@RestController
public class CalculatorController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CalculatorService calculatorService;

    @Value("S{zeebe.client.broker.gateway-address}")
    private String zeebeBrokerAddress;

    @RequestMapping(
            path = "/calculate",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity calculate(@RequestBody CalculationDto calculationDto) {
        try {
            Integer result = calculatorService.evaluate(calculationDto.expression);
            logger.info("Result = " + result);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(
            path = "/calculate_bpm",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity calculate_bpm(@RequestBody CalculationDto calculationDto) {
        try {
            final String broker = "127.0.0.1:26500";
            final ZeebeClientBuilder builder = ZeebeClient.newClientBuilder().brokerContactPoint(broker);
            HashMap<String, String> expression = new LinkedHashMap<>();
            expression.put("expression", calculationDto.expression);
            ZeebeClient zeebeClient = builder.build();
            zeebeClient.newCreateInstanceCommand()
                .bpmnProcessId("evaluator_service").latestVersion()
                .variables(expression)
                .send()
                .exceptionally( throwable -> { throw new RuntimeException("Could not create new instance", throwable); });

            // Correlate messages to process instances using the Java Client:
//            zeebeClient.newPublishMessageCommand() //
//                    .messageName("messageA")
//                    .messageId(uniqueMessageIdForDeduplication)
//                    .correlationKey(message.getCorrelationid())
//                    .variables(singletonMap("paymentInfo", "YeahWeCouldAddSomething"))
//                    .send()
//                    .exceptionally( throwable -> { throw new RuntimeException("Could not publish message " + message, throwable); });
//
            return ResponseEntity.status(HttpStatus.ACCEPTED).build();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
