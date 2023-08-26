package com.example.exceptiondemo;

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
        throw new RuntimeException("에러 입니다.");
    }
}
