package com.bridgeit.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7=context.getBean(Samsung.class);
		s7.config();
		
		
	}
}
