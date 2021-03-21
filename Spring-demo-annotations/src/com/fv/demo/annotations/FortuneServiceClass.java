package com.fv.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceClass implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
	
}
