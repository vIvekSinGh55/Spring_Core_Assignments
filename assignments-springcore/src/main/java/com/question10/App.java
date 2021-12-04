package com.question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

		Applicationclass n = (Applicationclass) context.getBean("hii");

		n.walk();

		Build a = (Build) context.getBean("pro");
		a.Slow();

	}

}
