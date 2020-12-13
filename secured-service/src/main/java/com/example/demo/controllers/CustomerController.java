package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;

@RestController
public class CustomerController {

	
	@Autowired
	private CustomerService service;
	
	
	@GetMapping(path = "/api/v1/customers")
	public List<Customer> getAllCustomer() {
		
		return this.service.getAllCustomers();
	}
	
	@GetMapping(path = "/api/v1/customers/{id}")
	public Customer getById(@PathVariable("id") int id) {
		
		return this.service.getCustomer(id);
	}
	
}
