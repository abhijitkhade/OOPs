package com.prowing.scenarios;

public class Foo {
	//public void m1(int...name) {
	//}
//public void m1(char[]value) {
//	System.out.println("char[]...name");
//	
//}
//public void m1(Long value) {
//	System.out.println("Long name");}
//	
	public void m1(long...value) {
		System.out.println("long...name");
		
}
public static void main(String[] args) {
	Foo f =new Foo();
	//int[]value= {10,20,30};
	
	//f.m1(value);
	//f.m1('a','e');
	//f.m1(10);
	//f.m1'a','i');
	//f.m1(10l);
	Integer i=10;
	Integer j=20;
	f.m1(i,j);
	//f.m1(10);
}
}
