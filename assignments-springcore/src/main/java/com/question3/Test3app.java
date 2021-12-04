package com.question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3app 
{
	public static void main( String[] args )
	{
	    
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("Bankacc.xml");  
	    BankAccountController Ac=(BankAccountController)applicationcontext.getBean("acc");  
	    Ac.withdraw();
	    
	    ApplicationContext applicationcontext1=new ClassPathXmlApplicationContext("Bankacc.xml");  
	    BankAccountController Ac1=(BankAccountController)applicationcontext1.getBean("acc1");  
	    Ac1.withdraw();
	    
	    
	}
}
