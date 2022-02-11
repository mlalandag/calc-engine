package com.pryzintul.services;

import com.pryzintul.operators.IOperator;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class Calculator {

    public int calculate (IOperator operator, HashMap params) {

        return operator.calculate(params);
    }

}
