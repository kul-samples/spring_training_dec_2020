package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Doctor;

@SpringBootApplication
public class MethodLookupApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(MethodLookupApplication.class, args);
	
		 Doctor rajesh1 = ctx.getBean(Doctor.class);
		 
		 System.out.println(rajesh1);
		 
		 
        Doctor rajesh2 = ctx.getBean(Doctor.class);
		 
		 System.out.println(rajesh2);
		 
		 ctx.close();
	
	}

}
