package com.example.demo.config;

import com.example.demo.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.demo.model.Hospital;
import com.example.demo.repos.PatientRepository;


@Configuration
public class ApplicationConfig {

	
	// Factory Method for IoC container to create a instance
	
	@Bean()
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
	@Lazy
	public Hospital malar() {
		
		System.out.println("Hospital called ===========");
		// passing the method name itself as a reference
		return new Hospital(1920, "Fortis Malar", 9840100, 600040,malarAddress());
		
	}
	
	@Bean
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Address malarAddress() {
		
		System.out.println("=========== MALAR ADDRESS CALLED =======");
		return new Address("Gandhi Street", "Nehru Nagar","Chennai",600050);
		
	}
	
	
	@Bean()
	public Hospital manipalHospital(@Qualifier("manipal") Address address) {
		
		// passing the method parameter and the parameter is qualified with bean id
		return new Hospital(1921, "ManiPal Hospital", 9840100, 600040,address);
		
		// return new Hospital(1921, "ManiPal Hospital", 9840100, 600040,manipalAddress());
		
	}
	
	@Bean(name="manipal")
	public Address manipalAddress() {
		
		return new Address("Patel Street", "sarvarkar Nagar","pune",400050);
		
	}
	
	
	@Bean(name="apollo")
	@ConditionalOnProperty(name = "myapp.bean.address",havingValue = "create")
	public Address apolloAddress() {
		
		return new Address("Shivaji Street", "kalewadi","pune",400100);
		
	}
	
	
	@Bean(name = "rajesh")
	public Doctor doctorRajesh() {
		
		
		Doctor doctor =new Doctor();
		
		doctor.setDoctorId(983);
		doctor.setDoctorName("Rajesh Patil");
		
		return doctor;
		
	
			}
	
	// Registering Just One Bean for Autowiring
	@Bean
	//@Primary        // Even Though more than one bean of the same type exist only bean with @primary will be injected
	public Patient sawant() {
		
		return new Patient(15601,"Sawant",34);
	}
	
	
	@Bean
	public Patient vikas() {
		
		return new Patient(25601,"Vikas",44);
	}
	
	@Bean
	public CommandLineRunner  runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			private PatientRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new com.example.demo.entity.Patient(25601,"Vikas",44));
				repo.save(new com.example.demo.entity.Patient(25602,"Vicky",45));
				repo.save(new com.example.demo.entity.Patient(25603,"Manish",46));
				
				
				
			}
		};
	}
}
