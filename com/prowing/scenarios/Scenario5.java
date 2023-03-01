package com.prowing.scenarios;

public class Scenario5 {
	public void method  (Object i) {
		System.out.println("method inside Object");
		
	}
	public void method  (String i) {
		System.out.println("method inside Object");
		
	}
//	public void method  (Integer i) {
//		System.out.println("method inside Object");
//		
//	}
//	public void method  (Float i) {
//		System.out.println("method inside Object");
//		
//	}
//	public void method  (Number i) {
//		System.out.println("method inside Object");
//		
//	}
public static void main(String[] args) {
	Scenario5 s= new Scenario5();
	s.method(null);
	
	
}
}
