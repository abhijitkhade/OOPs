package com.prowing.scenarios;

import java.io.FileNotFoundException;
import java.io.IOException;

public class NewSenario1 extends NewSenario {

	
	
		public void m1()throws FileNotFoundException
		{
			System.out.println("new Scenario");
		}
	
	
public static void main(String[] args)
{
	//NewSenario n = new NewSenario();
	NewSenario1 n1 = new NewSenario1();
	
	n1.m1();
	
}
}
