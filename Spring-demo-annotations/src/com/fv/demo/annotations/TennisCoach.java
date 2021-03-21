package com.fv.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired 
	@Qualifier("fortuneServiceClass")
	private FortuneService fortuneService;

	// Default constructor
	public TennisCoach() {
	System.out.println(" TennisCoach: inside default constructor");
	}


	// Define a method
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(" TennisCoach: inside doSomeCrazyStuffMedhod" );
		fortuneService = theFortuneService;
	}
	// Defining a setter method
	@Autowired
	public void setFortuneService (FortuneService theFortuneService) {
		System.out.println(" TennisCoach: inside the setFortuneService()");
		fortuneService = theFortuneService;
	}

	  @Autowired public TennisCoach(FortuneService fortuneService) {
	  this.fortuneService = fortuneService; }
	 */
	 
	@Override
	public String getDailyWorkout() {
		return "inside TennisCoach getDailyWorkout method";

	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();

	}

}
