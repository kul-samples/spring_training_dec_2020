package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

	
	   @Value("${server.port}")
	   private String port;
	   
	   
	   
	   @GetMapping(path = "/api/v1/reviews/hospital/{name}")
	   public String getReview(@PathVariable("name") String name) {
		   
		   String resp = port;
		   
		   if(name.contains("chn")) {
			   
			   resp = port + " 4.2 Good Service";
		   } else {
			   
			   try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			   resp = port + "4.0 average service";
		   }
		  
		  return resp;
	   }
	   
	   
}
