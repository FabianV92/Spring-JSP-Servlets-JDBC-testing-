package com.fv.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boss implements InterfaceDoStuff {

	// Fields
	@Autowired
	@Qualifier("todaysTasks")
	private InterfaceDoStuff interfaceDoStuff;

	@Override
	public String programmThis() {		
		return interfaceDoStuff.programmThis();
	}

	@Override
	public String getACoffe() {
		return interfaceDoStuff.getACoffe();
	}
	
}
