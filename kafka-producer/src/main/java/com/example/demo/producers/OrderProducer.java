package com.example.demo.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.*;
import com.example.demo.model.Order;

@Component
public class OrderProducer {

	
	@Autowired
	private KafkaTemplate<String, Order> template;
	
	
	public void sendOrders(Order entity) {
		
        ListenableFuture<SendResult<String, Order>> future =  template.send("saleorder",entity);
        
                 future.addCallback(new ListenableFutureCallback<SendResult<String, Order>>() {

					@Override
					public void onFailure(Throwable ex) {
						
						ex.printStackTrace();
						
					}

					@Override
					public void onSuccess(SendResult<String, Order> result) {
						
						System.out.println("Message "+ result + "Sent");
						
					}
                	 
                	 
				});

	}
}
