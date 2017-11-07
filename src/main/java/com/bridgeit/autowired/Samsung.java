package com.bridgeit.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor cpu;
	
	
	public void config() {
		System.out.println("3gb ram 32gb internal ");
		cpu.process();
	}
}
