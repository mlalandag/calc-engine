package com.pryzintul.calcengine.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter
@Getter
public class CalculationDto {

    public String functionName;
    public HashMap params;

}
