package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.InfoService;

@RestController
public class WelcomeController {

	
	@Autowired
	private InfoService service;
	
	@GetMapping(path = "/first")
	public String getDetails() {
		
		
		return this.service.firstOperation();
	}
	
	
	@GetMapping(path = "/second")
	public String showDetails() {
		
		
		return this.service.secondOpeation();
	}
	
}
