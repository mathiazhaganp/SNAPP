package com.hexaware.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.model.Ball;
import com.hexaware.model.ConfigBall;
import com.hexaware.model.Pen;

public class Example3 {
	public static void main(String[] args) {
		   ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigBall.class);
		   
		   // now both beans A and B will be available...
		   Ball ball = ctx.getBean(Ball.class);
		   Pen pen = ctx.getBean(Pen.class);
		}
}
