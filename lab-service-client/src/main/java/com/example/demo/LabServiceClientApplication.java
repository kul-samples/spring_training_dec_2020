package com.example.demo;

import org.example.demo.configs.CustomConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "lab-service",configuration = CustomConfig.class)
public class LabServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabServiceClientApplication.class, args);
	}

}
