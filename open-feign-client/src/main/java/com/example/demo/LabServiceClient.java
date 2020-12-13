package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:3232" ,name="lab-service")
public interface LabServiceClient {
	
	@GetMapping(path = "/api/v1/labs/{city}")
	public String getLabDetails(@PathVariable("city") String city) ;
	
}
