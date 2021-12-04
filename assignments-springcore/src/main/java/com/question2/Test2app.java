package com.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2app {

	public static void main(String[] args) {
	
		ApplicationContext context= new ClassPathXmlApplicationContext("Question2.xml");
		 
		
		QueList q1=(QueList) context.getBean("questionlist");
		QueSet q2=(QueSet) context.getBean("questionset");
		QueMap q3=(QueMap) context.getBean("questionmap");
		q1.displayInfo();
		q2.displayInfo();
		q3.displayInfo();

	}

}
