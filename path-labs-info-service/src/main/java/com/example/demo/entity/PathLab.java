package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "practo_labs")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PathLab {

	
	@Id
	private int id;
	private String labName;
	private String location;
	private double rating;
	
}