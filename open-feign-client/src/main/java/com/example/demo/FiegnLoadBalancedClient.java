package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("HOSPITAL-REVIEW-SERVICE")
public interface FiegnLoadBalancedClient {


	 @GetMapping(path = "/api/v1/reviews/hospital/{name}")
	   public String getReview(@PathVariable("name") String name) ;
		
}
