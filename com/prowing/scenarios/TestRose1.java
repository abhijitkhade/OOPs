package com.prowing.scenarios;

import java.io.IOException;

public class TestRose1 extends Marigold {
	
	public void m1(char a) throws IOException
	{
		System.out.println("m1 onside testrose1");
	}
	
	public static void main(String[] args) //throws IOException 
	{
		TestRose1  t= new TestRose1 ();
		t.m1('a');
	}
}
