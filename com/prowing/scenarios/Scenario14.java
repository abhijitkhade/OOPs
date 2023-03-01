package com.prowing.scenarios;

public class Scenario14{
	
	protected Number m1(int a)
	{ 
	 System.out.println("One"); 
	  return null; 
	} 
	Object m2()
	{ 
	 System.out.println("Two"); 
	  return null; 
	 } 
	} 
	 class YZ extends Scenario14
	{ 
	protected String m2()
	{ 
	 System.out.println("Three"); 
	  return null; 
	 } 
	} 


