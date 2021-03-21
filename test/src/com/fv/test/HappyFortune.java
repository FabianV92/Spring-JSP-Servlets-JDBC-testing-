package com.fv.test;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "TODAY is a happy day!";
	}

}
