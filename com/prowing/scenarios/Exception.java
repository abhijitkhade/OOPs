package com.prowing.scenarios;

import java.io.IOException;

class Exception {
	public void m1()throws IOException 
	{
		System.out.println("inside Exception");
		
	}
public class Suhas extends Exception
{
	public void m1()throws IOException
	{
	System.out.println("Inside null pointer");	
	}
	
	public static void main(String[] args)
	{
		Suhas s = new Suhas();
	}
}
}
