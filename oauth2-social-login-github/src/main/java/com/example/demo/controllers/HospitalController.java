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
	
	
	@GetMapping(path = "/message")
	public String getMessage() {
		
		return "hello world";
	}
}

//Client Id :96e42120e347f2282405
//
//client Secret 7a814421d5c9803bfcb383d4d11ac6709bfd16a1
//
