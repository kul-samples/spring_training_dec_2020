package com.example.demo.repos;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	//Custom Query Method using findByProperty/attribute in entity class Pattern
	
	public List<Patient> findByPatientName(String patientName);
	
	public List<Patient> findByAgeGreaterThan(int age);
	
	
	@Query(value = "update practo_hospitals set age=:age where id =:id",nativeQuery = true)
	@Modifying
	@Transactional
	public Patient updatePatientAge(int id, int age);
}
