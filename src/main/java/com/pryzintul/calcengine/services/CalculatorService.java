package com.pryzintul.calcengine.services;

import com.pryzintul.calcengine.operators.IOperator;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CalculatorService {

    public int calculate (IOperator operator, HashMap params) {

        return operator.calculate(params);
    }

}
