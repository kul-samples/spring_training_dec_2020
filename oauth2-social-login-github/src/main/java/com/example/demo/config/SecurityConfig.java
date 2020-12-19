package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	     

	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		  .antMatchers("/","/actuator")
		    .permitAll().antMatchers("/api/v1/hospitals/**").authenticated().anyRequest()
		       .authenticated().and().oauth2Login();
		   }

		  

	



}

