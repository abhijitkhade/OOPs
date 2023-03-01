package com.prowing.scenarios;

import java.io.IOException;

public class BaseClass {

	protected void m1()
	{
	  System.out.println("Base");
	}
	 class base extends BaseClass  {
	public void m1() 
	{
	  System.out.println("Child");
	}
	 }
	public static void main(String[] args)
	{
		BaseClass l = new BaseClass();
		l.m1();
		l.m1();
	}

	}

