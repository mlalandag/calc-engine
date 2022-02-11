package com.pryzintul.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter
@Getter
public class CalculationDto {

    public String operatorName;
    public HashMap params;

}
