package com.example.productservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductserviceApplication {
	private static final Logger logger = LoggerFactory.getLogger(ProductserviceApplication.class);

	public static void main(String[] args) {
		logger.info("Starting ProductserviceApplication...");
		SpringApplication.run(ProductserviceApplication.class, args);
		logger.info("ProductserviceApplication started.");
	}
}