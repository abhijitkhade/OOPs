package com.prowing.abstraction;

public class Employee1 extends Person1{

	@Override
	public boolean isValidAge() {
		if (this.age>=18)
			return true;
		else
		return false;
	}
	public Employee1() {
		
	}
	public Employee1(int age,int weight,float height)
	{
	super(age, weight,height);
	
	}
	public static void main(String[] args) {
		
		Employee1 emp=new Employee1(20,62,5.7f);
		emp.isValidAge();
		emp.printPersonInfo();
		System.out.println(emp.isValidAge());
	}
	

}
