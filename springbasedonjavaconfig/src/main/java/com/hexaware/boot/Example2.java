package com.hexaware.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.model.TextEditor;
import com.hexaware.model.TextEditorConfig;

public class Example2 {
	   public static void main(String[] args) {
	      ApplicationContext ctx = 
	         new AnnotationConfigApplicationContext(TextEditorConfig.class);

	      TextEditor te = ctx.getBean(TextEditor.class);
	      te.spellCheck();
		  System.out.println("Hello");
		  System.out.println("HAQ ");
	   }
	}