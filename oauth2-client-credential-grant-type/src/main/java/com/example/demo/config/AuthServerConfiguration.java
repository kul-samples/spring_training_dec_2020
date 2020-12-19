package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

@EnableAuthorizationServer
@Configuration
public class AuthServerConfiguration extends AuthorizationServerConfigurerAdapter {

	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
	security.tokenKeyAccess("isAuthenticated()")
	    .checkTokenAccess("isAuthenticated()")  ;
	}
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
	clients.inMemory()
	.withClient("ourclient")
	.authorizedGrantTypes("client_credentials")
	.secret(encoder().encode("pass345"))
	.scopes("read","write")
	.redirectUris("http://localhost:6060/login/oauth2/code/ourclient")
	.autoApprove(false);


	}
	 @Override
	 public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
	 endpoints.authenticationManager(authenticationManager);
	 }

	 @Bean
	     public BCryptPasswordEncoder encoder() {
	         return new BCryptPasswordEncoder();
	     }

}
