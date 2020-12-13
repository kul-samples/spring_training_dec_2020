package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	
	@Autowired
	private FiegnLoadBalancedClient client;
	
	
	@Autowired
	private LabServiceClient client2;
	
	
	@GetMapping(path = "/client/{hospitalName}")
	public String getReviews(@PathVariable("hospitalName") String name) {
		
		return client.getReview(name);
	}
	
	
	@GetMapping(path = "/lab/{name}")
	public String getLabs(@PathVariable("name") String name) {
		
		return client2.getLabDetails(name);
		
	}
	
}
