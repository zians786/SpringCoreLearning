package com.bridgeit.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Vehicle object = (Vehicle) context.getBean("vehicle");
		Vehicle object = (Vehicle) context.getBean("car");
		Vehicle object1 = (Vehicle) context.getBean("bike");
		Tyre tyre=(Tyre) context.getBean("tyre");
		System.out.println(tyre);
		object.drive();
		object1.drive();
	}
}
