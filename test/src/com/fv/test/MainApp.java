package com.fv.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	// Load the spsing file
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
	// Retrieve the bean
	FortuneService getCookie = context.getBean("chineseCookie" , FortuneService.class);
	
	// Testing test method
	System.out.println(getCookie.getFortune());
	
	// Close the context
	context.close();

	}
}
