package com.prowing.scenarios;


	public class W extends Scenarios2{
		 public  void m1(int a) {
			 System.out.println("inside m1(int a)");
		 }
	public static void main(String[] args) {
		W w = new W();
		
		w.m1(10);
		w.m1();
	
}
	}
