package com.fv.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		// Read the spring xml configuration file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from the spring container
		InterfaceMethods tes = context.getBean("theWiseCookie", InterfaceMethods.class);
		
		// Test the methods
		System.out.println(tes.doStuff());
		
		// Close the context
		context.close();
	}
}
