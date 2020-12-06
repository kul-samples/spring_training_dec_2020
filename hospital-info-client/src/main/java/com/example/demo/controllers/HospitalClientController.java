package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.HospitalClientService;

@RestController
@CrossOrigin(origins = "*")
public class HospitalClientController {

	
	@Autowired
	private HospitalClientService service;
	
	
	@GetMapping(path = "/api/v1/client/patients")
	public String getPatients() {
		
		return this.service.getHospitalObject();
	}
}
