package com.example.demo.consumers;

import java.util.concurrent.CountDownLatch;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.demo.model.Order;

@Component
public class OrderConsumer {

	
	public CountDownLatch latch = new CountDownLatch(3);
	
	
	@KafkaListener(topics = "saleorder",groupId = "sales-group",containerFactory = "listnerFactory")
	public void listener(Order entity) {
		
		
		System.out.println("Recevied Message :="+ entity);
		
		
		latch.countDown();
	}
}
