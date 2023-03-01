package com.prowing.abstraction;

public class TestInterface2
{
	public static void main(String[] args) {
		
		SBI1 obj =new SBI1();
		
		obj.rateOfInterest();
		
		HDFC1 obj1 = new HDFC1();
		
		obj1.rateOfInterest();
		
		System.out.println(obj.rateOfInterest());
		
		System.out.println(obj1.rateOfInterest());
	}

}
