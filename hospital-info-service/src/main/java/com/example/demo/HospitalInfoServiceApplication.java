package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Address;
import com.example.demo.model.Doctor;
import com.example.demo.model.Hospital;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class HospitalInfoServiceApplication {

	public static void main(String[] args) {
		
		 // reference of ConfigurableApplicationcontext is the IoC Container
		
		ConfigurableApplicationContext ctx= SpringApplication.run(HospitalInfoServiceApplication.class, args);
		
		// getBean Method takes the Id and Type of the Bean as arguments
		
//		 Hospital obj = ctx.getBean("default",Hospital.class);
//		 
//		 System.out.println(obj);
//		 
//		 Hospital fortis = ctx.getBean("malar",Hospital.class);
//		 
//		 System.out.println(fortis);
//		 
//		 
//         Hospital manipal = ctx.getBean("manipalHospital",Hospital.class);
//		 
//		 System.out.println(manipal);
//		 
//		 
//        Address  appolloAddress = ctx.getBean("apollo",Address.class);
//		 
//		 System.out.println(appolloAddress);
//		
		
		Doctor doc = ctx.getBean(Doctor.class);
		
//		 if(doc.getPatient()!=null)
//		 {
//		log.info(doc.toString());
//		 } else {
//			 log.info("Register a Patient Bean");
//		 }

		 doc.getPatientList().forEach(System.out::println);
		 
		ctx.close();
	}

}
