package com.prowing.scenarios;

import java.io.IOException;

public class Three extends Two {
public void m1()throws FileNotFound
{
	
	System.out.println("m1 three");
	
	
}
public static void main(String[] args) throws Throwable 
{
	One o= new Two();
	o.m1();
	Two t= new Three();
	t.m1();
	Three th= new Three();
	th.m1();
	
}
}
