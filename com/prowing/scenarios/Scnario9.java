package com.prowing.scenarios;

public class Scnario9 extends Marigold1 {
	public void colour(char s) throws IOException 
	{
		System.out.println("yellow");
	}
	public static void main(String[] args) {
		Scnario9 s = new Scnario9();
		s.colour('a');
	}
}
