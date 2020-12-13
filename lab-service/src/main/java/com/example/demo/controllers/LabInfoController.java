package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabInfoController {

	
	@Value("${server.port}")
	private String port;
	
	@GetMapping(path = "/api/v1/labs/{city}")
	public String getLabDetails(@PathVariable("city") String city) {
		
		String lab = "Dr.Lals path Lab,sector-4";
		
		if(city.equals("chennai")) {
			lab = "Lister Plus,chennai" ;
		}
		
		return lab+ ":"+this.port;
		
	}
}
