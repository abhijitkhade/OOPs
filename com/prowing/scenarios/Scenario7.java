package com.prowing.scenarios;

public class Scenario7 {

	
	 class Marigold extends Scenario7
	{ 
	public void color(char m) throws NullPointerException
	{ 
	 System.out.println("Orange"); 
	 } 
	} 
	 class Sunflower extends Marigold 
	{  public static void main(String[] args) {
		Sunflower s= new Sunflower();
		s.color('a');
	}
	}
}
		


