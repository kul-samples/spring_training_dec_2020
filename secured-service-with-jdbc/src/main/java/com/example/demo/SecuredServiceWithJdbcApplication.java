package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Hospital;

@SpringBootApplication
public class SecuredServiceWithJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuredServiceWithJdbcApplication.class, args);
	}

	
	@Bean
	public Hospital malar() {
		
		return new Hospital(101,"Malar Hospital",100100);
	}
	
	@Bean
	public Hospital appollo() {
		
		return new Hospital(102,"Apollo Hospital",200100);
		
	}

}
