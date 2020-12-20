package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringCloudLoadBalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLoadBalancerApplication.class, args);
	}

    @Bean
    @LoadBalanced
    WebClient.Builder builder() {
        return WebClient.builder();
    }
    
    @Bean
    WebClient webClient(WebClient.Builder builder) {
        return builder.build();
    }
}
