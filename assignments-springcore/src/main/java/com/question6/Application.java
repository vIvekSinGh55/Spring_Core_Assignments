package com.question6;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@PropertySource("classpath:app.properties")
@SpringBootConfiguration
public class Application 
{
	public static void main(String[] args) 
	{	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Service s= (Service)context.getBean("service");
		s.Show();
			
		
			

	}

}
