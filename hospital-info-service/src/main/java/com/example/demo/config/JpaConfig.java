package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repos.DoctorRepository;
import com.example.demo.repos.PatientRepository;
import com.example.demo.entity.*;
@Configuration
public class JpaConfig {

	
	@Bean
	public CommandLineRunner  runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			private PatientRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new Patient(25601,"Vikas",44));
				repo.save(new Patient(25602,"Vicky",45));
				repo.save(new Patient(25603,"Manish",46));
				
				
				
			}
		};
		
	
		
		
	}
}
