package com.telia.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CoPELoggerApplication {
	public static void main(String[] args) {
		SpringApplication.run(CoPELoggerApplication.class, args);
	}
}
