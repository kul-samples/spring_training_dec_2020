package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	
	
	@Autowired
	private RestTemplate template;

	
	@GetMapping(path = "/labs/{location}")
	public String getLabDetails(@PathVariable("location") String location) {
		
		
		String baseURL = "http://lab-service/api/v1/labs/"+location;
		
		return template.getForObject(baseURL, String.class);
	}
}
