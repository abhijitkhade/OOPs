package com.prowing.abstraction;

public abstract  class Atm {
	public Atm() {
		
	}
	
public boolean withdraw(int pin,int accNo,int enteredAmount)
{
	//if pin is valid-->
	//isValidPin(pin);
	//if account is valid-->>
	//isValidAcc(accNo);
	
	int currentBalance=2000;
	
	if(enteredAmount<=10000 && enteredAmount<=currentBalance)
		return true;
	else
		return false;
}
public abstract boolean changePin(int OldPin,int newPin);

public int showBalance(int pin,int accNo)
{

	
	//if pin is valid-->
	//	isValidPin(pin);
		//if account is valid-->>
	//	isValidAcc(accNo);
		 
		int currentBal=3456;
		return currentBal;
}

	}


