package com.example.demo;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.exception.HystrixTimeoutException;


public class HystrixFallbackConfiguration implements FallbackProvider  {

	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return "hospital-review-client";
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		if (cause instanceof HystrixTimeoutException) {
            return new GatewayClientResponse(HttpStatus.GATEWAY_TIMEOUT, "SERVICE taking too much time respond");
        } else {
            return new GatewayClientResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Servie Not Available");
	}
}

}