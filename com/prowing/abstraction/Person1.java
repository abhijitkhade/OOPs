package com.prowing.abstraction;

public abstract class Person1 {
	
	int age;
	int weight;
	float height;
	
	



	public Person1(int age, int weight, float height) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public Person1() {
		super();
		
	}
	public abstract boolean isValidAge();
	
	public void printPersonInfo() {
		System.out.println(this.age);
		System.out.println(this.weight);
		System.out.println(this.height);
	}
}
