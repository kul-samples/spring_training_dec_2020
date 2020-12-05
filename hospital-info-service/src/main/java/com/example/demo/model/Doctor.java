package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {

	int doctorId;
	String doctorName;
	
	// 0 Bean - required false sets null value - without it throws a nullpointer exception
	//@Autowired
	//@Autowired(required = false)
	//@Autowired
	//@Qualifier(value = "vikas")
	//Patient patient;
	
	// IoC will aggregate the beans of type Patient and creates a collection 
	@Autowired
	List<Patient> patientList;
	
}
