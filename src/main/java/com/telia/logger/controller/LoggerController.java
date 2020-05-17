package com.telia.logger.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telia.logger.dto.LoggerDto;
import com.telia.logger.model.Logger;
import com.telia.logger.repository.LoggerRepository;
import com.telia.logger.service.LoggerService;

@RestController
@RequestMapping("/logger")
public class LoggerController {
	
	@Autowired
	private LoggerService loggerService;
	
	@GetMapping("/isalive")
    public ResponseEntity<Object> isAlive() {
    	return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @PostMapping
    public void postLogs(@RequestBody LoggerDto dto) {
    	loggerService.add(dto);
    }
    
    @GetMapping
    public ResponseEntity<List<Logger>> getLogs() {
        return new ResponseEntity<>(loggerService.getLogs(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Logger> getLogById(@PathVariable(required = true) long id) {
    	return new ResponseEntity<>(loggerService.getLogById(id), HttpStatus.OK);
    }

}
