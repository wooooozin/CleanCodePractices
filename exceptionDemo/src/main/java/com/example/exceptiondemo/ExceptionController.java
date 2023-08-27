package com.example.exceptiondemo;

import com.example.exceptiondemo.exception.CustomException;
import com.example.exceptiondemo.type.ExceptionCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/exception")
    public void error() {
        throw new CustomException(ExceptionCode.INTERNAL_ERROR);
    }
}
