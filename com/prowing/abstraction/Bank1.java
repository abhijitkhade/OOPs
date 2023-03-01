package com.prowing.abstraction;

public interface Bank1 {
	float rateOfInterest();
}
class SBI1 implements Bank1
{

	public float rateOfInterest() {return 9.5f;}
	
	}
class HDFC1 implements Bank1
{
	public float rateOfInterest() {return 7.5f;}
}
