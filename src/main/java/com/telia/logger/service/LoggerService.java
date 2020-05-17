package com.telia.logger.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telia.logger.dto.LoggerDto;
import com.telia.logger.exception.LoggerNotFoundException;
import com.telia.logger.model.Logger;
import com.telia.logger.repository.LoggerRepository;

@Component
public class LoggerService {
	
	@Autowired 
	LoggerRepository repository;

	public void add(LoggerDto dto) {
		repository.save(toEntity(dto));
		
	}

	public List<Logger> getLogs() {
		return (List<Logger>) repository.findAll();
	}

	public Logger getLogById(long id) {
	    Optional<Logger> optionalLogger = repository.findById(id);
        return optionalLogger.orElseThrow(() -> new LoggerNotFoundException("Couldn't find a Dog with id: " + id));
	    
	}
	
    private Logger toEntity(LoggerDto dto) {
    	
    	ModelMapper modelMapper = new ModelMapper();
    	Logger logger = modelMapper.map(dto, Logger.class);
    	
    	return logger;
    	
    }

    

}
