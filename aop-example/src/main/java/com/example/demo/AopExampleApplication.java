package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AopExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(AopExampleApplication.class, args);

		
		  CustomerService service = ctx.getBean(CustomerService.class);
		  
		  System.out.println(service.getClass());
		  
		  System.out.println(service.findById(2));
		  
		  String[] names = service.findAll();
		  
		   for(String eachName: names) {
			   
			   System.out.println(eachName);
		  
		   }
		  
		   ctx.close();

	
	}

}
