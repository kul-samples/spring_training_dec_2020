package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HospitalClientService {

	
	private String baseURL = "http://localhost:6060/api/v1";
	
	private String logicalURL = "http://HOSPITAL-INFO-SERVICE/api/v1";
	
	@Autowired
	private RestTemplate template;
	
	
	public String getHospitalObject() {
		
		//String reqURL= baseURL+"/patients";
		
		String reqURL = logicalURL+ "/patients";
		
	   return template.getForObject(reqURL, String.class);	
	}
}
