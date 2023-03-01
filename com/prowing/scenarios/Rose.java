package com.prowing.scenarios;


public class Rose 
	{ 
	public void color(char r)
	{ 
	 System.out.println("Red"); 
	 } 
	} 
	 class Marigold extends Rose
	{ 
	@Override 
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
	@Override 
	public final void color(char s)// throws IOException
	
	{ 
		
		
	 System.out.println("Yellow"); 
	 } 
	}


