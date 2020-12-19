package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hospital;

@RestController
public class HospitalController {

	
	
	@Autowired
	private Hospital malar;
	
	@Autowired
	private Hospital appollo;
	
	
	
	@GetMapping(path = "/api/v1/hospitals/{id}")
	public Hospital getHospitalById(@PathVariable("id") int id) {
		
		Hospital obj = malar;
		
		 if(id==1) {
			 obj = appollo;
		 }
		
		 return obj;
	}
	
}
