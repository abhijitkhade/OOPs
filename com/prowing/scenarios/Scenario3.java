package com.prowing.scenarios;

public class Scenario3 {
	

	
			public void m1()
			{
			   System.out.println("inside Test - m1()");
			}


			public static void main(String[] args)
			{
			  
			  Scenario3 t = null;
			  Scenario3 t1= new Scenario3();
			  t1.m1();
			  t.m1();
			}
	}


