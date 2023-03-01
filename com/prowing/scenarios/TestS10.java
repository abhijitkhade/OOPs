package com.prowing.scenarios;

public class TestS10 extends S10 {
	public void m1(int a)throws IOException
	{
		System.out.println("int a test s10");
	}
public static void main(String[] args) {
	TestS10 t= new TestS10();
	t.m1(10);
}    
}
