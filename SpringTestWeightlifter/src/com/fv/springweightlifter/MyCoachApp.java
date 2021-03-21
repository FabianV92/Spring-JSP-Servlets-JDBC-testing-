package com.fv.springweightlifter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCoachApp {

	public static void main(String[] args) {

		// Load the Spring File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the beans from the spring container
		Coach currentCoach = context.getBean("myCurrentCoach", Coach.class);
		
		// Call the methods on the bean
		System.out.println(currentCoach.yourDailyExercise());
		// Close the context
		context.close();
	}
}
