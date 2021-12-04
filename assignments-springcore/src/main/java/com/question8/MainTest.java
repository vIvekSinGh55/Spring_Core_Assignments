package com.question8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("shape.xml");
		context.registerShutdownHook();  
		Shape obj=(Shape) context.getBean("shape");
		obj.draw();
		  

	}
}