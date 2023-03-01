package com.prowing.abstraction;

abstract class Bank2 {
	abstract int getRateOfInterest();
}

class HDFC extends Bank2 {
	int getRateOfInterest() {
		return 7;
	}
}

class PNB extends Bank2 {
	int getRateOfInterest() {
		return 7;
	}
}

class TestBank2 {
	public static void main(String args[]) {
		Bank2 b = new HDFC();// if object is PNB, method of PNB will be invoked
		int interest = b.getRateOfInterest();
		System.out.println("Rate of Interest is: " + interest + " %");
	}
}
