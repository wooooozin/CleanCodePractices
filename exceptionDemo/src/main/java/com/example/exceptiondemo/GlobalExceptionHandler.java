package com.example.exceptiondemo;

import com.example.exceptiondemo.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<?> runtimeException(CustomException e) {
        CustomErrorResult result = CustomErrorResult.builder()
                .code(e.getCode().name()) // Using name() method of enum
                .message(e.getCode().getMessage()) // Using getMessage() method of enum
                .build();

        return new ResponseEntity<>(result, e.getCode().getHttpStatus()); // You can use the HttpStatus of the exception code.
    }
}
