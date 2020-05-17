package com.telia.logger.exception;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class LoggerServiceErrorAdvice {

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ RuntimeException.class, SQLException.class, NullPointerException.class })
    public void handle() {
    }
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
    @ExceptionHandler({LoggerNotFoundException.class})
    public void handle(LoggerNotFoundException e) {
    }




}
