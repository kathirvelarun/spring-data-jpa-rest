package com.telia.logger.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telia.logger.model.Logger;

@Repository
public interface LoggerRepository extends CrudRepository<Logger, Long>{ 

}
