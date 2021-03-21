package com.fv.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class ProgrammingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Write a Hello World cmd output";
	}
	
	@Override
	public String getDailyFortune() {
		return "Today is a happy day! Here is your fortune! ";
	}
}
