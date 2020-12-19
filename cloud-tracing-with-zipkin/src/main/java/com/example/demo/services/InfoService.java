package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import brave.Tracer;

@Service
public class InfoService {

	
	@Autowired
	private Tracer tracer;
}
