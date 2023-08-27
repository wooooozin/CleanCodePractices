package com.example.exceptiondemo;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Value
@Builder
@Data
public class CustomErrorResult {
    private String code;
    private String message;
}
