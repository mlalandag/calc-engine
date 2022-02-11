package com.pryzintul.operators;

import java.util.HashMap;

public class SumOperator implements IOperator {

    public int calculate(HashMap params) {
        return (int) params.get("left") + (int) params.get("right");
    }

}
