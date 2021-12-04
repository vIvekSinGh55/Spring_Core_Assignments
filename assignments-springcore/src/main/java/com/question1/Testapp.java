package com.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testapp 

{

	public static void main(String[] args) 
	
	{
		
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("CustomerInfo.xml");
		
		 Address address=(Address) context.getBean("address");
		 
		 Customer customer=(Customer) context.getBean("customer");
		 
		 customer.displayInfo();
		 
		 address.displayAddress();
		 

	}

}
