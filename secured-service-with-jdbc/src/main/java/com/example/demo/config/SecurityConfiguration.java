package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	// Spring will read the application.yml and create the datasource object
	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		
		//auth.jdbcAuthentication().passwordEncoder(encoder()).dataSource(dataSource);
		
		

String query1 = "select userName,password,enabled from users where userName = ?";

String query2  = "select userName,authority from authorities where userName=?"; 

auth.jdbcAuthentication()
         .dataSource(dataSource)
         .authoritiesByUsernameQuery(query1)
         .authoritiesByUsernameQuery(query2)
         .passwordEncoder(new BCryptPasswordEncoder());

	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

//		http.authorizeRequests()
//		    .antMatchers("/api/v1/hospital/**")
//		      .authenticated().and().httpBasic().and().csrf().disable();
//	
		
		http.authorizeRequests()
	    .antMatchers("/api/v1/hospitals/**")
	      .authenticated().and().formLogin().and().logout().logoutSuccessUrl("/api/v1/hospitals/**");

	}

	// This Bean provides the CRUD Operations to work the user and authorities tables
//	@Bean
//	public JdbcUserDetailsManager  userDetailsManager() {
//		
//		return new JdbcUserDetailsManager(dataSource);
//	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}
}
