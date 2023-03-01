package com.prowing.abstraction;

public abstract class Person {
	 String name;
	 int age;
	 int weight;
	 float height;
	 static String country="india";
	public Person(String name, int age, int weight, float height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public Person() {
		super();
	}
	
public abstract boolean isValidAge(); 
	
public void printPersonInfo()
{
	System.out.println(this.name);
	System.out.println(this.age);
	System.out.println(this.weight);
	System.out.println(this.height);
	System.out.println(this.country);
}
}
