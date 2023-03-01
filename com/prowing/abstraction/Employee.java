package com.prowing.abstraction;

public class Employee extends Person {
	public boolean isValidAge()
	{
		if(this.age>= 18)
			
			return true;
		else
			return false;
			
	}

	public Employee()
	{
		
		
	}
	public Employee(String name, int age, int weight, float height)
	{
		super(name,age,weight,height);
		
	}
	public static void main(String[] args) {
		
		
		Employee emp=new Employee("abhi",27,62,5.3f);
		emp.printPersonInfo();
		System.out.println(emp.isValidAge());
	}
}

