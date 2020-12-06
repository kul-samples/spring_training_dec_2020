package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repos.DoctorRepository;
import com.example.demo.services.PatientService;

@RestController
@CrossOrigin(origins = "*")

	
public class DoctorController {

	
	@Autowired
	private DoctorRepository repo;
	
	
}
