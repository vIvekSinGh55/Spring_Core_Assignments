package com.assignmentsspringcore.assignmentsspringcore;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class QueList {

	@Test
	void Listtest() {
		ApplicationContext context = new ClassPathXmlApplicationContext
				("applicationContext.xml");
		 QueList qvl=(QueList) context.getBean("questionlist");
		 
		 assertEquals(qvl.getClass().getSimpleName(), "QueList" );

		
	}

}