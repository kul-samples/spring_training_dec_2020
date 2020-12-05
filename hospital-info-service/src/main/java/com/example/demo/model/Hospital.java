package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
// spring framework related annotation to register as a Bean 

@Component(value = "default")
public class Hospital {

	int hospitalNumber;
	String hospitalName;
	long phoneNumber;
	long pinCode;
	
	Address address;
}
