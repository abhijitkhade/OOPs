package com.prowing.abstraction;

abstract class Bank {
	abstract int getRateOfInterest();
}
class SBI extends Bank {
	 int getRateOfInterest()
	 {return 7;}
}
class PNJ extends Bank {
	int getRateOfInterest()
	{return 8;}
}

