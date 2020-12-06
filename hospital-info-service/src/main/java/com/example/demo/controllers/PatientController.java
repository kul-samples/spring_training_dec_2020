package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@GetMapping(path = "/api/v1/patients/{id}")
	public Patient getPatient(@PathVariable("id") int id){
		
		return this.service.getPatientByid(id);
	}
	
	@PostMapping(path = "/api/v1/patients")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Patient addPatient(@RequestBody Patient entity){
		
		return this.service.addPatient(entity);
	}
	
	
	@PutMapping(path = "/api/v1/patients")
	public Patient updatePatient(@RequestBody Patient entity){
		
		return this.service.updatePatient(entity);
	}
	
	
	@DeleteMapping(path = "/api/v1/patients")
	public ResponseEntity<String> remoPatient(@RequestBody Patient entity){
		
		   this.service.removePatient(entity);
		   
		   return ResponseEntity.ok("Record Deleted");
		   
	}
	
	@GetMapping(path = "/api/v1/patients/name/{name}")
	public List<Patient> getPatientByName(@PathVariable("name") String name){
		
		return this.service.getPatientByName(name);
	}
	

	@GetMapping(path = "/api/v1/patients/age/{age}")
	public List<Patient> getPatientByAgeGreater(@PathVariable("age") int age){
		
		return this.service.getPatientByAgeGreater(age);
	}
}
