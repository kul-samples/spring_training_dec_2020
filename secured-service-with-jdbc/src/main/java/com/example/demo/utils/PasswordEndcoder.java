package com.example.demo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEndcoder {

	public static void main(String[] args) {

		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		

		 System.out.println(encoder.encode("guest"));
		 
		
		 
	}

}

//secret
//$2a$10$t49HK7S/1QajVYe5RqM1.ewUzbmOqMLA0IDK5JDAiQrhGY8OqDZoK

//password
//$2a$10$nSwbkfLjrbWWPLbnJoFgZuolxUT8RsFhYj/eEeB4groWuUexkoBFy

//guest
//$2a$10$hk7UqyBA3aETf/rfre4m7.TvWrEtsQW4fCInKhe2TQEyINSnG6s8a
