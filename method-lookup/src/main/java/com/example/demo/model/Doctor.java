package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j

@Component
@Scope("singleton")
public class Doctor {

	int doctorId;
	String doctorName;
	
	@Autowired
	Patient patient;
	
	public Doctor() {
		
		System.out.println("Inside Doctor");
	}
	
	
//	@Lookup
//	public Patient getPatient() {
//	log.info("Lookup Called");
//	return null;
//	}
	
}
