package com.assignmentsspringcore.assignmentsspringcore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.question1.Address;
import com.question1.Customer;

class CustomerTest {

		@Test
		public void test() {
			ApplicationContext context = new ClassPathXmlApplicationContext("displayCustomerInfo.xml");
			Customer customer2 = (Customer)context.getBean("customer");
			
			 
			Customer obj = new Customer(1, "VS", "12345672",new Address("My street", "Dombivli", "maharashtra", 421203, "India"));
			
			
			if (customer2.getCustomerName().equals(obj.getCustomerName())) {
				System.out.println("Success");
			} else {
				fail("Not yet implemented");
			}
		}
}
