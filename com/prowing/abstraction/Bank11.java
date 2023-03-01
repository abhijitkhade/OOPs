package com.prowing.abstraction;

public class Bank11 {

	public static void main(String[] args) {
		Bank b;
		
		b = new SBI();
		System.out.println("rate of intrest is:"+b.getRateOfInterest()+"%");
	 
	
	b = new PNJ();
	System.out.println("rate of intrest is:"+b.getRateOfInterest()+"%");
} 

}
