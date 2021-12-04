package com.question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
		 
        Customer c = (Customer) ac.getBean("mycustomer");
        System.out.println(c.toString());
	}

}