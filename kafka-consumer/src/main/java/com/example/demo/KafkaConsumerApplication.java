package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.consumers.OrderConsumer;

@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(KafkaConsumerApplication.class, args);
		
		OrderConsumer consumer = ctx.getBean(OrderConsumer.class);
		
		
		try {
			consumer.latch.await(10,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
