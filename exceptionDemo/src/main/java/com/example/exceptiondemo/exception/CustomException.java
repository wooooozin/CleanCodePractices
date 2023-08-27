package com.example.exceptiondemo.exception;

import com.example.exceptiondemo.type.ExceptionCode;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    private final ExceptionCode code;

    public CustomException(ExceptionCode code) {
        super(code.getMessage());
        this.code = code;
    }

    public CustomException(String message, ExceptionCode code) {
        super(message);
        this.code = code;
    }

    public CustomException(String message, Throwable cause, ExceptionCode code) {
        super(message, cause);
        this.code = code;
    }

    public CustomException(Throwable cause, ExceptionCode code) {
        super(cause);
        this.code = code;
    }

    public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ExceptionCode code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
