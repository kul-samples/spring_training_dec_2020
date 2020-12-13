package com.example.demo;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class GatewayClientResponse implements ClientHttpResponse {

	String string;
	HttpStatus gateWayTimeout;
	public GatewayClientResponse(HttpStatus gatewayTimeout, String string) {
		this.gateWayTimeout = gatewayTimeout;
		this.string = string;
	}

	@Override
	public InputStream getBody() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpHeaders getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpStatus getStatusCode() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRawStatusCode() throws IOException {
		// TODO Auto-generated method stub
		return this.gateWayTimeout.ordinal();
	}

	@Override
	public String getStatusText() throws IOException {
		// TODO Auto-generated method stub
		return this.gateWayTimeout.getReasonPhrase();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

}
