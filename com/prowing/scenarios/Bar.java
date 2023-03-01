package com.prowing.scenarios;

public class Bar extends Foo1 {
	int x=5;
	int y=6;
	void m1(int y) {
		System.out.println("x = "+x);
		System.out.println("y= "+y);
	}
public static void main(String[] args) {
	
	Foo1 f =new Bar();
	f.m1();
}
}
