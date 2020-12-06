package com.example.demo.entity;

import org.springframework.hateoas.CollectionModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment extends CollectionModel<Payment>{

	
	private int txnId;
	private String txnDetails;
	private double amount;
}
