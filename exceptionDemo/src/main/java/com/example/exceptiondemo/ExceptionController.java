package com.example.exceptiondemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
