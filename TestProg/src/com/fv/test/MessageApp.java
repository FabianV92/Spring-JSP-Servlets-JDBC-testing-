package com.fv.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageApp {

	public static void main(String[] args) {
		// ******TESTS*****
		
		
		
		//*******TESTS*****
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean
		InterfaceDoStuff doStuff = context.getBean("boss", InterfaceDoStuff.class);

		// Test some methods
		System.out.println(doStuff.getACoffe());
		System.out.println(doStuff.programmThis());

		// Close the context
		context.close();

	}
}
