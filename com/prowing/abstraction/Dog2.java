package com.prowing.abstraction;

	public class Dog2 extends Animal {

		public void makeSound()
		{
		System.out.println("Bark bark");
		
	}

		
		public static void main(String[] args) {
			
			Dog2 obj = new Dog2();
			
			obj.makeSound();
			obj.eat();
			
		}
	}

	
		


