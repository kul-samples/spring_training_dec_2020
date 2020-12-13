package org.example.demo.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class CustomConfig {

	
	
	@Autowired
    IClientConfig config;
    
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        
 //return new BestAvailableRule();
 
      IRule rule = new RoundRobinRule();
               return rule;
              
    }

}
