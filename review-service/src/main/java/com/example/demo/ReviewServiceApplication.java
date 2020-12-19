package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewServiceApplication.class, args);
	}

	
//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/employee/**")
//                        .uri("lb://FIRST-SERVICE")
//                        .id("employeeModule"))
//
//                .route(r -> r.path("/consumer/**")
//                        .uri("lb://SECOND-SERVICE")
//                        .id("consumerModule"))
//                .build();
//    }


}
