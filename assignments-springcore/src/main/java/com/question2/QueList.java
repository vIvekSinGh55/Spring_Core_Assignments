package com.question2;

import java.util.Iterator;
import java.util.List;

public class QueList 
{
	private int questionId;
	private String question;
	private List<String> answers;
	
	
	
	public QueList(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}



	public void displayInfo() {
		System.out.println("This is done via List and Injected via Constructor");
		System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next()); 
	    }  
	}
	
	

}
