package com.prowing.polymorphisam.overriding;

public class Dog extends Animal {
	public void displayInfo() {
		System.out.println(" i am dog");
		
	
}
	public static void main(String[] args) {
		Dog d= new Dog();
		Animal A= new Animal();
		Animal a= new Dog();
		
		d.displayInfo();
	}
}
