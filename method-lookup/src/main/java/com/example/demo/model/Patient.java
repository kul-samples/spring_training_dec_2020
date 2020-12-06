package com.example.demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


@Component
@Scope("prototype")
public class Patient {

	
	int patientId;
	String patientName;
	int age;
	
	public Patient() {
		
		System.out.println("Inside Patient");
	}
}
