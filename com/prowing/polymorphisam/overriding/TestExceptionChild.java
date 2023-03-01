package com.prowing.polymorphisam.overriding;

public class TestExceptionChild extends Parent{    
	  
	 public void msg()
	 {    
	    System.out.println("child method"); 
	 }
	 
	 public static void main(String[] args) {
		Parent p= new TestExceptionChild();
		try {
			p.msg();
		}
		catch(Exception e) {}
	}
}

	    
	  




