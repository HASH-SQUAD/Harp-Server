package com.hash.harp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class HarpApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarpApplication.class, args);
	}

}
