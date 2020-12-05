package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repos.PatientRepository;

@Service
public class PatientService {

	
	
	private PatientRepository repo;

	@Autowired
	public void setRepo(PatientRepository repo) {
		this.repo = repo;
	}
	
	
	private List<Patient> getAllPatients(){
		
		  return this.repo.findAll();
	}
	
}
