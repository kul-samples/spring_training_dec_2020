package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.ContinueSpan;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.stereotype.Service;

import brave.Tracer;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InfoService {

	
	@Autowired
	private Tracer tracer;
	
	
	public String firstOperation() {
		
		log.info("First Operation Started");
		
		return "Hello From First";
		
	}
	
	@NewSpan
	public String secondOpeation() {
		
		String resp ="From Second";
		log.info("Second Operation Called");
		
		try {
			Thread.sleep(1000);
			
			resp = thirdOperations();
		} catch (InterruptedException e) {
			log.debug("Inside catch block");
			e.printStackTrace();
		}
		
		log.info("Finished SecondOperation");
		
		return resp;
	}
	
	
	@ContinueSpan
	public String thirdOperations() {
		
		
		return "Bye Bye";
	}
}
