package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Order;
import com.example.demo.producers.OrderProducer;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(KafkaProducerApplication.class, args);
		
		    Order firstOrder = ctx.getBean(Order.class);
		    
		    OrderProducer producer = ctx.getBean(OrderProducer.class);
		    
		    producer.sendOrders(firstOrder);
		    
		    
	}

	
	@Bean
	public Order firstOrder() {
		
		return new Order(501,"Manish",15600);
	}
}
