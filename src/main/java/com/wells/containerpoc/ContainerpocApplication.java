package com.wells.containerpoc;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContainerpocApplication {

	public static void main(String[] args) {
		 TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		SpringApplication.run(ContainerpocApplication.class, args);
	}

}
