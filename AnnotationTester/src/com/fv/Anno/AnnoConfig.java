package com.fv.Anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.fv.Anno")
@PropertySource("classpath:Data")
public class AnnoConfig {

	@Bean
	public DoStuff magicSentence() {
		return new MagicSentence();
	}
	
	@Bean 
	public DoStuff magicCookie() {
		return new MagicCookie(magicSentence());
	}
	
	
}
