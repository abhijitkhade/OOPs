package com.prowing.assosiation;

public class Employee {
	String name;
	long mobno;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, long mobno) {
		super();
		this.name = name;
		this.mobno = mobno;
	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", mobno=" + mobno + "]";
//	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobno=" + mobno + "]";
	}
	

}
