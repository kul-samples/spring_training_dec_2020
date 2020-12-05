package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

// Lombok Annotations 
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


// JPA Related Annotations
@Entity
@Table(name = "practo_hospitals")
public class Patient {

	@Id    //JPA Annotations
	int patientId;
	String patientName;
	int age;
}
