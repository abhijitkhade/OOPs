package com.prowings.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {

		Account Acc = new Account();
		
		Acc.setAccountNumber(1020310);
		Acc.setAmmount(2000);
		Acc.setName("Abhijit");
		
		System.out.println(Acc.getAccountNumber());
		System.out.println(Acc.getAmmount());
		System.out.println(Acc.getName());
		
		//System.out.println(Acc.getAccountNumber(),Acc.getAmmount(),Acc.getName());
	}
}
