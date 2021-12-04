package com.question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class Testapp 
{
	
	private static ApplicationContext context;
	public static void main(String[] args) {
		 
		context = new ClassPathXmlApplicationContext("bean.xml");
		BankAccount account = (BankAccount)context.getBean("Account");
		System.out.println(account.accountBalance);
		
		
		BankAccountcontroller account2 = (BankAccountcontroller)context.getBean("bankAccountcontroller");
		System.out.println(account2.getBalance(10));
		 
	}

}