package com.hexaware.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.model.HelloWorld;
import com.hexaware.model.HelloWorldConfig;

public class Example1 {
	
	public static void main(String[] args) {
		   ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		   
		   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		   helloWorld.setMessage("Hello World!");
		   helloWorld.getMessage();
		   System.out.println("Hello");
		    System.out.println("Hello");
		}

}
