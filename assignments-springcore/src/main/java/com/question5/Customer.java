package com.question5;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Customer {
	  private String id;
	    private String name;
	 
	   @Resource(name="myinfo")
	    private Info info;
	 
	    public String getId() {
	        return id;
	    }
	    @Required
	    public void setId(String id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public Info getCompany() {
	        return info;
	    }
	    public void setCompany(Info info) {
	        this.info = info;
	    }
	 
	    @Override
	    public String toString() {
	        return "Customer [id=" + id + ", name=" + name + ", info=" + info.toString() + "]";
	    }
	
}


