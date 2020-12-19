package com.example.demo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEndcoder {

	public static void main(String[] args) {

		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		

		 System.out.println(encoder.encode(args[0]));
		 
		 
	}

}

//secret
//$2a$10$t49HK7S/1QajVYe5RqM1.ewUzbmOqMLA0IDK5JDAiQrhGY8OqDZoK

//password
//$2a$10$nSwbkfLjrbWWPLbnJoFgZuolxUT8RsFhYj/eEeB4groWuUexkoBFy

