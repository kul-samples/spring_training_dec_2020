package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Patient;
import com.example.demo.repos.PatientRepository;

@Service
public class PatientService {

	
	
	private PatientRepository repo;

	@Autowired
	public void setRepo(PatientRepository repo) {
		this.repo = repo;
	}
	
	
	public List<Patient> getAllPatients(){
		
		  return this.repo.findAll();
	}
	
	public Patient getPatientByid(int id) {
		
		return this.repo.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
	}
	
	public Patient addPatient(Patient entity) {
		
		  return this.repo.save(entity);
	}
	
	public Patient updatePatient(Patient entity) {
		
		  return addPatient(entity);
	}
	
	
	public void removePatient(Patient entity) {
		
		
		   this.repo.delete(entity);
		   
	}
	
	public List<Patient> getPatientByName(String name){
		
		return this.repo.findByPatientName(name);
	}
	
   public List<Patient> getPatientByAgeGreater(int age){
		
		return this.repo.findByAgeGreaterThan(age);
	}
	
   public int updateAge(int id, int age){
		
	   
		return this.repo.updatePatientAge(id, age);
		
		
	}
	
  	
}
