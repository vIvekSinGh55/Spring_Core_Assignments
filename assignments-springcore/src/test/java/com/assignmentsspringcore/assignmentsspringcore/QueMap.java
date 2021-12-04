package com.assignmentsspringcore.assignmentsspringcore;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.question2.QueMap;

class QuestionViaMapTest {

	@Test
	void Maptest() {
		ApplicationContext context = new ClassPathXmlApplicationContext
				("applicationContext.xml");
		QueMap qvl2=(QueMap) context.getBean("questionmap");
		 
		 assertEquals(qvl2.getClass().getSimpleName(), "QueMap" );

		
	}
}

