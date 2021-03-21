package com.fv.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChineseCookie implements FortuneService {
	
	@Autowired
	private FortuneService fortuneService;
	
	public ChineseCookie() {
	}
	
	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
