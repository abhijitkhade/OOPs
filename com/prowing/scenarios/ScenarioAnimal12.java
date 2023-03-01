package com.prowing.scenarios;

public class ScenarioAnimal12 {
	
	
	public static void main(String[] args) 
	{ 
	 Animal a = new Cat(); 
	  a.m1(a); 
	 Dog d = new Dog(); 
	  d.m1(a); 
	  
	  Cat c = new Cat();
	// Cat c1 = (Cat)a; 
	// c1.m1(a);
	  c.m1(null); 
	 } 
	}






