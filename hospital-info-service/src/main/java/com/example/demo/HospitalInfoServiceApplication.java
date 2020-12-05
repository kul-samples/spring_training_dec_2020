package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Address;
import com.example.demo.model.Doctor;
import com.example.demo.model.Hospital;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class HospitalInfoServiceApplication {

	public static void handleAutoWiring(ApplicationContext ctx) {
		
		Doctor doc = ctx.getBean(Doctor.class);
        
		
//		 if(doc.getPatient()!=null)
//		 {
//		log.info(doc.toString());
//		 } else {
//			 log.info("Register a Patient Bean");
//		 }

		 doc.getPatientList().forEach(System.out::println);

	}
	
	public static void createBeans(ApplicationContext ctx) {
		
		
		// getBean Method takes the Id and Type of the Bean as arguments
		
	
		 Hospital obj = ctx.getBean("default",Hospital.class);
		 
		 System.out.println(obj);
		 
		 Hospital fortis = ctx.getBean("malar",Hospital.class);
		 
		 System.out.println(fortis);
		 
		 
        Hospital manipal = ctx.getBean("manipalHospital",Hospital.class);
		 
		 System.out.println(manipal);
		 
		 
        Address  appolloAddress = ctx.getBean("apollo",Address.class);
		 
		 System.out.println(appolloAddress);
		
	}
	
	public static void handleBeanScopes(ApplicationContext ctx) {
		
		Hospital hosp = ctx.getBean("malar",Hospital.class);
		

		Hospital hosp2 = ctx.getBean("malar",Hospital.class);

		System.out.println(" IS Singleton := "+ctx.isSingleton("malar"));
		
		System.out.println(" IS Protoype := "+ctx.isPrototype("malar"));
		
		System.out.println("Is Address Bean Singleton :="+ hosp.getAddress());
		
		System.out.println("Is Address Bean Singleton :="+ hosp2.getAddress());
		
		
	}
	public static void main(String[] args) {
		
		 // reference of ConfigurableApplicationcontext is the IoC Container
		
		ConfigurableApplicationContext ctx= SpringApplication.run(HospitalInfoServiceApplication.class, args);
		
		//handleAutoWiring(ctx);
		
		//createBeans(ctx);
		
		
		// handleBeanScopes(ctx);
		
			 
		ctx.close();
	}

}
