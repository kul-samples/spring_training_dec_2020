package com.example.demo;

import com.example.demo.entity.PathLab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.repo.PathLabRepository;
import com.example.demo.entity.*;
@SpringBootApplication
public class PathLabsInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PathLabsInfoServiceApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			private PathLabRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new PathLab(203, "lal path labs","chennai", 4.2));
				repo.save(new PathLab(204, "medplus path labs","pune", 4.3));
				
			}
		};
	}

}
