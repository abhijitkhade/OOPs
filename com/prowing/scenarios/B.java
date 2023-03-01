package com.prowing.scenarios;


public class B extends Scenarios1 {

	
	
	public void method1() {
		System.out.println("inside child method1");
	}
	public static void main(String[] args) {
		//Scenarios1 c = new B();
		B b=new B();
		
		b.method1();
		b.method1(null);
		//c.method1();
	}

}


