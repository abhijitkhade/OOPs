package com.prowing.abstraction;

public  class AbstractionImp extends Abstraction {
	public void print()
	{
		System.out.println("inside print method");
	}
	public static void main(String[] args) {
		
		Abstraction obj = new AbstractionImp();
		
		obj.print();
		obj.printHello();     //method from parent class
	}
	

}
