package com.pryzintul.calcengine.controllers;

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

@RestController
public class CalculatorController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(
            path = "/calculate",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity calculate(@RequestBody CalculationDto calculationDto) {
        try {
            Integer result = calculatorService.evaluate(calculationDto .expression);
            logger.info("Result = " + result);
            return new ResponseEntity(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
