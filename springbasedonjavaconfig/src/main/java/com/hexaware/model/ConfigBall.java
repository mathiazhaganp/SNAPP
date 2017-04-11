package com.hexaware.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigPen.class)
public class ConfigBall {
   @Bean
   public Ball ball() {
      return new Ball(); 
   }
   
   
}