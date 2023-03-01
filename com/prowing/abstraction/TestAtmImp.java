package com.prowing.abstraction;

public class TestAtmImp {

	public TestAtmImp()
	{
		
	}
	public static void main(String[] args) {
		
		
		Atm a=new AtmImp();
        a.changePin(20, 300);
		a.showBalance(500, 10000);
		System.out.println(a.showBalance(500, 10000));
		AtmImp obj=new AtmImp();
		
		boolean pinChanged=obj.changePin(10, 20);
		
		System.out.println("pin changed:"+pinChanged);
		
		boolean result=obj.withdraw(1323,100, 2000);
		
		System.out.println("withdraw"+result );
		
	//	int bal= obj.showBalance(500, 10000);
		
		System.out.println("available Balance is");
		
		
	}
}
