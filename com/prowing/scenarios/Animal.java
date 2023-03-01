package com.prowing.scenarios;

public class Animal {
	
	
	void m1(Animal a)
	{ 
	 System.out.println("Both dogs and cats are pets."); 
	 } 
	} 
	 class Dog extends Animal
	{ 
	@Override 
	protected void m1(Animal a)
	{ 
	 System.out.println("The only dog is a pet animal."); 
	 } 
	} 
	 class Cat extends Dog 
	{ 
	@Override 
	public void m1(Animal a)
	{ 
	 System.out.println("Cat is also a pet animal."); 
	 } 
	} 


