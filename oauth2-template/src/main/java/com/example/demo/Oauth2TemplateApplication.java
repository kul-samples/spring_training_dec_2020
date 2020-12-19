package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

import com.nimbusds.oauth2.sdk.ResourceOwnerPasswordCredentialsGrant;
import com.nimbusds.oauth2.sdk.auth.Secret;

@SpringBootApplication
public class Oauth2TemplateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(Oauth2TemplateApplication.class, args);
	
		OAuth2RestTemplate template = ctx.getBean(OAuth2RestTemplate.class);
	
		String resp =  template.getForObject("http://localhost:4040/api/v1/hospitals/1", String.class);
		
		 System.out.println(resp);
	}

	
	@Bean
	public OAuth2RestTemplate template() {
		
		
ResourceOwnerPasswordResourceDetails details = new ResourceOwnerPasswordResourceDetails();

     details.setAccessTokenUri("http://localhost:4040/oauth/token");
     
     
		details.setClientId("ourclient");
		details.setClientSecret("pass345");
		details.setUsername("india");
		details.setPassword("india");
		details.setGrantType("password");
		
  
       OAuth2RestTemplate template = new OAuth2RestTemplate(details);
       
         return template;
	}
}
