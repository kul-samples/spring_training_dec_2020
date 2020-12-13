package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
public class LabServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabServiceApplication.class, args);
	}

}
