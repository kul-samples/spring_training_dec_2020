package com.example.demo.services;
import com.example.demo.model.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	
	@Autowired
	@Qualifier("ramesh")
	private Customer ramesh;
	
	
	@Autowired
	private List<Customer> custList;
	
	public Customer getCustomer(int id) {
		
		return ramesh;
	}
	
	public List<Customer> getAllCustomers(){
		
		return this.custList;
	}
}
