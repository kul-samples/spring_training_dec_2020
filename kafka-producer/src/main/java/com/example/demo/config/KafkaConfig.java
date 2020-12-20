package com.example.demo.config;

import java.util.HashMap;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.*;
import com.example.demo.model.Order;

@Configuration
public class KafkaConfig {

	
	@Bean
	public ProducerFactory<String,String> producerFactory(){
		
		Map<String,Object> configs = new HashMap<>();
		
		
		configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9200");
		configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		
		return new DefaultKafkaProducerFactory<>(configs);
		
		
	}
	
	@Bean
	public KafkaTemplate<String, Order> template(){
		
		return new KafkaTemplate(producerFactory());
	}
	

	 @Bean
	 public NewTopic topic1() {
		 
		 return new NewTopic("orders",1,(short)1);
	 }
}
