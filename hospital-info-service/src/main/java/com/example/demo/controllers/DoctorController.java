package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repos.DoctorRepository;
import com.example.demo.services.PatientService;

@RestController
@CrossOrigin(origins = "*")

	
public class DoctorController {

	
	@Autowired
	private DoctorRepository repo;
	
	
	
	@GetMapping(path = "/api/v1/doctors")
	public List<Doctor> getAllDoctors(){
		
		return this.repo.findAll();
	}
}
