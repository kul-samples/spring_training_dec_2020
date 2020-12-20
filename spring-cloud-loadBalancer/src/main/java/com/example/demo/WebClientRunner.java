package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController

public class WebClientRunner {

	@Autowired
	WebClient client;
	String  message;

	@GetMapping(path = "/client")
	public String getInfo() {
		
	    	 Mono<String> bodyMono = client.get()
	    		     .uri("http://HOSPITAL-REVIEW-SERVICE/api/v1/reviews/hospital/chn")
	    		     .accept(MediaType.APPLICATION_JSON)
	    		     .retrieve()
	    		     .bodyToMono(String.class);
	    	 bodyMono.subscribe( s -> this.message = s);
	    return  this.message;
	    		 

	    }
	}

