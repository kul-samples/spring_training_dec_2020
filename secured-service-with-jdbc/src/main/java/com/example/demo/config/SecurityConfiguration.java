package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		
		auth.jdbcAuthentication().dataSource(dataSource);
		
	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		    .antMatchers("/api/v1/**")
		      .authenticated()
		        .and()
		           .csrf()
		               .disable()
		                .httpBasic();
	
	}

	// This Bean provides the CRUD Operations to work the user and authorities tables
	@Bean
	public JdbcUserDetailsManager  userDetailsManager() {
		
		return new JdbcUserDetailsManager(dataSource);
	}
	
}
