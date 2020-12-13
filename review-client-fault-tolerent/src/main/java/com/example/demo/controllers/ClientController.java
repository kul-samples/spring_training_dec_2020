package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class ClientController {

	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	
	
	@GetMapping(path = "/reviews/{city}")
	@HystrixCommand(fallbackMethod = "fetchReviewsFallBack",commandProperties =  
	      @HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds",value = "3000"))
	public String fetchReviews(@PathVariable("city") String name) {
		
		ServiceInstance instance = loadBalancer.choose("hospital-review-service");
		
		String baseURI = instance.getUri().toString();
		

		String reqURI = baseURI+ "/api/v1/reviews/hospital/"+name;
		
		return  template.getForObject(reqURI, String.class);
	}
	
	
	public String fetchReviewsFallBack(String name) {
		
		return " default rating - 3.4";
	}
	
}
