package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Hospital;

@SpringBootApplication
public class HospitalInfoServiceApplication {

	public static void main(String[] args) {
		
		 // reference of ConfigurableApplicationcontext is the IoC Container
		
		ConfigurableApplicationContext ctx= SpringApplication.run(HospitalInfoServiceApplication.class, args);
		
		// getBean Method takes the Id and Type of the Bean as arguments
		
		 Hospital obj = ctx.getBean("default",Hospital.class);
		 
		 System.out.println(obj);
		 
		 Hospital fortis = ctx.getBean("malar",Hospital.class);
		 
		 System.out.println(fortis);
		 
		 
         Hospital manipal = ctx.getBean("manipalHospital",Hospital.class);
		 
		 System.out.println(manipal);
		 
		 
		ctx.close();
	}

}
