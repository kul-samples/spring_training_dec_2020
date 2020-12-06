package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Payment;

@RestController
public class PaymentController {

	
	@Autowired
	private Payment payment;
	
	@GetMapping(path = "/api/v1/payments/{id}")
	public Payment getPayment(@PathVariable("id") int id) {
		
		return payment;
	}
}
