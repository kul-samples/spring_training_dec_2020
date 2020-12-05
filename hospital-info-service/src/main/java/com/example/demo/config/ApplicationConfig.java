package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Hospital;

@Configuration
public class ApplicationConfig {

	
	// Factory Method for IoC container to create a instance
	
	@Bean()
	public Hospital malar() {
		
		return new Hospital(1920, "Fortis Malar", 9840100, 600040);
		
	}
}
