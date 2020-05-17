package com.telia.logger.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NO_CONTENT)
public class LoggerNotFoundException extends RuntimeException {
    public LoggerNotFoundException(String message) {
        super(message);
    }

}
