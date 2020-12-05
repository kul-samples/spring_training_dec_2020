package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.services.PatientService;

@RestController
@CrossOrigin(origins = "*")
public class PatientController {

	
	@Autowired
	private PatientService service;
	
	
	@GetMapping(path = "/api/v1/patients")
	public List<Patient> getAllPatients(){
		
		return this.service.getAllPatients();
	}
}
