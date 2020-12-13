package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import com.example.demo.model.*;
@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)

public class SecuredServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuredServiceApplication.class, args);
	}

	
	@Bean
	public Customer ramesh() {
		
		return new Customer(101,"Ramesh","ram@abc.com");
	}
	
	@Bean
	public Customer manish() {
		
		return new Customer(102,"Manish","amn@abc.com");
	}
	
	
	@Bean
	public Customer suresh() {
		
		return new Customer(103,"Suresh","sru@abc.com");
	}
	
	@Bean
	public Customer abhijeet() {
		
		return new Customer(104,"Abhijeet","abhi@abc.com");
	}
}
