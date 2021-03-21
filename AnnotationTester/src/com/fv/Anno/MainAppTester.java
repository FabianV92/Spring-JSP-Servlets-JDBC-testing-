package com.fv.Anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppTester {
	
	public static void main(String[] args) {
		
	// Read the configuration file
	AnnotationConfigApplicationContext context = new
			AnnotationConfigApplicationContext(AnnoConfig.class);
	
	// Retrieve the bean from the spring container
	DoStuff  doWhatever = context.getBean("magicCookie", MagicCookie.class); 
	
	// Test methods
	System.out.println(doWhatever.doStuff());
	
	
	
	// Close the context
	context.close();

	}
}
