package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.example.demo.model.Hospital;

@SpringBootApplication
@EnableResourceServer
public class Oauth2ClientCredentialGrantTypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ClientCredentialGrantTypeApplication.class, args);
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
