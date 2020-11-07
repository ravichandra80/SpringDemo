package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	 private static final Logger logger = LogManager.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		logger.info("Dempo Class - info");
		logger.error("Dempo Class- error");
		logger.debug("Dempo Class - debug");
		SpringApplication.run(DemoApplication.class, args);
		System.err.println("hai how are you");
	}

}
