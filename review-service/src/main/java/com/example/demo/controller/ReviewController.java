package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

	
	   @Value("${server.port}")
	   private String port;
	   
	   
	   
	   @GetMapping(path = "/api/v1/reviews")
	   public String getReview() {
		   
		   
		  int rating = Integer.parseInt(port)/1000;
		  
		  return Integer.toString(rating);
	   }
	   
	   
}
