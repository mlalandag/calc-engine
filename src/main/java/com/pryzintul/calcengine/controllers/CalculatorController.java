package com.pryzintul.calcengine.controllers;

import com.pryzintul.calcengine.operators.IOperator;
import com.pryzintul.calcengine.services.CalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.pryzintul.calcengine.dtos.CalculationDto;
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
public class CalculatorController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CalculatorService calculatorService;

//    @Operation( summary = "Realiza el cálculo",
//            description = "Realiza el cálculo",
//            tags = { "Calculator" })
    @RequestMapping(
            path = "/calculate",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> calculate(@RequestBody CalculationDto calculationDto) {
        try {
            Class<?> clazz = Class.forName("com.pryzintul.calcengine.operators." + calculationDto.functionName);
            Constructor<?> ctor = clazz.getConstructor();
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
