package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	
	@GetMapping(path = "/reviews")
	public String fetchReviews() {
		
		ServiceInstance instance = loadBalancer.choose("hospital-review-service");
		
		String baseURI = instance.getUri().toString();
		
		String reqURI = baseURI+ "/api/v1/reviews/";
		
		return  template.getForObject(reqURI, String.class);
	}
}
