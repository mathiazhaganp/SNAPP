package com.hexaware.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPen {
   @Bean
   public Pen pen() {
      return new Pen(); 
   }
}