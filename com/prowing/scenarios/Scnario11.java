package com.prowing.scenarios;

public class Scnario11 {
	
	 
	strictfp void method(int a)
	{ 
	 System.out.println("One"); 
	} 
	strictfp void method(double b)
	{ 
	 System.out.println("Two"); 
	 } 
	} 
	 class Y extends   Scnario11
	{ 
	@Override
	void method(double b)
	{ 
	 System.out.println("Three"); 
	 } 
	} 


