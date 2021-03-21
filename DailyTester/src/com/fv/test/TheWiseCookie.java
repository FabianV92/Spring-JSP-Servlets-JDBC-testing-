package com.fv.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TheWiseCookie implements InterfaceMethods {

	@Autowired
	@Qualifier("doStuff")
	private DoStuff doStuff;
	
	public TheWiseCookie(DoStuff doStuff) {
		this.doStuff = doStuff;
	}
	
	@Override
	public String doStuff() {
		return doStuff.doStuff();
	}

}
