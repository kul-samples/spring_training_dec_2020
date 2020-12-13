package com.example.demo;

public class Customer {

	
	private int id;
	private String firstName;
	private String email;
	
	public Customer() {
		super();
	
	}
	public Customer(int id, String firstName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", email=" + email + "]";
	}
	
	
	
}
