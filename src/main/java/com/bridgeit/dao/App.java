package com.bridgeit.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringDao.xml");
		StuddenDao student = (StuddenDao) context.getBean("studdenDao");
		int status = student.insert(new Student("Ziauddin", "13co18", "Comp", "7624449044"));
		System.out.println(status);
	}
}
