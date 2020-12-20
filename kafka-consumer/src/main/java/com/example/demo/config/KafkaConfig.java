package com.example.demo.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.example.demo.model.Order;

import java.util.*;
@Configuration
public class KafkaConfig {

	
	public ConsumerFactory<String, Order> consumerFactory(){
		
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "order-group");
        return new DefaultKafkaConsumerFactory(props, new StringDeserializer(),
                  new JsonDeserializer<>(Order.class));

	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Order> listnerFactory(){
		
		ConcurrentKafkaListenerContainerFactory<String, Order> factory = 
		         new ConcurrentKafkaListenerContainerFactory<>();
		        factory.setConsumerFactory(consumerFactory());
		        return factory;

		
		 
	}
}
