package com.example.demo.config;

import com.example.demo.model.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Hospital;


@Configuration
public class ApplicationConfig {

	
	// Factory Method for IoC container to create a instance
	
	@Bean()
	public Hospital malar() {
		
		// passing the method name itself as a reference
		return new Hospital(1920, "Fortis Malar", 9840100, 600040,malarAddress());
		
	}
	
	@Bean
	public Address malarAddress() {
		
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
	
}
