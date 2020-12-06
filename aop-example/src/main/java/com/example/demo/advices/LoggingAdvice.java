package com.example.demo.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Configuration
@EnableAspectJAutoProxy
public class LoggingAdvice {

	@Before("execution(* com.example.demo.CustomerService.*(..))")
	public void logBefore(JoinPoint jp) {
		
		log.info(jp.getSignature().getName() + "Called");
	}
	
	@Around("execution(* com.example.demo.CustomerService.*(..))")
	public Object timeTaken(ProceedingJoinPoint jp) throws Throwable {
		
		   long startTime = System.currentTimeMillis();
		
		   Object obj = jp.proceed();
	
		long endTime = System.currentTimeMillis();
		
		 String methodName =jp.getSignature().getName();
		 
		   if(methodName.equals("findById")) {
			   String resp =(String)obj;
			   obj = resp.concat(" Ji");

		   }
		   long timeTaken = endTime-startTime;
		   
		   log.info("completed in :="+timeTaken);
		   
		 return obj;
	}
	
}
