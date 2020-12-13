package com.example.demo.services;
import com.example.demo.model.*;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	
	@Autowired
	@Qualifier("ramesh")
	private Customer ramesh;
	
	
	@Autowired
	private List<Customer> custList;
	
	
	@Secured("ROLE_USER")
	public Customer getCustomer(int id) {
		
		return ramesh;
	}
	
	
	@RolesAllowed({"ROLE_ADMIN"})
	public List<Customer> getAllCustomers(){
		
		return this.custList;
	}
}
