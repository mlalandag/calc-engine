package com.pryzintul.calcengine.operators;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
public class Sum implements IOperator {

    public int calculate(HashMap<String, Object> params) {
        return (int) params.get("left") + (int) params.get("right");
    }

}
