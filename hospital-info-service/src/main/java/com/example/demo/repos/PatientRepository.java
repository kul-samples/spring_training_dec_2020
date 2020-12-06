package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	//Custom Query Method using findByProperty/attribute in entity class Pattern
	
	public List<Patient> findByPatientName(String patientName);
	
	public List<Patient> findByAgeGreaterThan(int age);
}
