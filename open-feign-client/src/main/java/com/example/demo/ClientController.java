package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	
	@Autowired
	private FiegnLoadBalancedClient client;
	
	@GetMapping(path = "/client/{hospitalName}")
	public String getReviews(@PathVariable("hospitalName") String name) {
		
		return client.getReview(name);
	}
	
}
