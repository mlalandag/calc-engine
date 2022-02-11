package com.pryzintul.controllers;

import com.pryzintul.operators.IOperator;
import com.pryzintul.services.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.pryzintul.dtos.CalculationDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.lang.reflect.Constructor;

@RestController
@RequestMapping("/api/v1")
public class CalculatorController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CalculatorService calculatorService;

    @Operation( summary = "Realiza el cálculo",
            description = "Realiza el cálculo",
            tags = { "Calculator" })
    @RequestMapping(
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "/calculate")
    public ResponseEntity<Integer> calculate(@RequestBody CalculationDto calculationDto) {
        try {
            Class<?> clazz = Class.forName("com.pryzintul.controllers." + calculationDto.operatorName);
            Constructor<?> ctor = clazz.getConstructor(String.class);
            Object operator = ctor.newInstance(new Object[] { });
            logger.info(operator.toString());
            int result = calculatorService.calculate((IOperator) operator, calculationDto.params);
                    logger.info("Result = " + result);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
