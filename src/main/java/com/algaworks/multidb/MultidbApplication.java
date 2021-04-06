package com.algaworks.multidb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.algaworks.multidb.config.properties")
public class MultidbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultidbApplication.class, args);
	}

}
