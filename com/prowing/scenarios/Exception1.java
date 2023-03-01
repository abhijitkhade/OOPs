package com.prowing.scenarios;

import java.io.IOException;

public class Exception1 {
	public void m1()throws IOException
	{
		System.out.println("m1 exception");
	}
public static void main(String[] args) throws IOException {
	Exception1 e = new Exception1();
	e.m1();
}
}
