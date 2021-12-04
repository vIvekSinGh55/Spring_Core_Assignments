package com.question7;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {
	public static void main(String[] args) {
	     
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spelbean.xml");
        Author author = (Author) context.getBean("authorBean");
        System.out.println(author.toString());
        System.out.println(author.getFullAuthorInfo());
        context.close();
}

}