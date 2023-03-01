package com.prowing.assosiation;

public class EmployeeAgg {
	
	Employee id;
	Address address;
	long salary;
	int leave;
	
	
	
	public EmployeeAgg() {
		super();
		// TODO Auto-generated constructor stub
	}



	public EmployeeAgg(Employee id, Address address, long salary, int leave) {
		super();
		this.id = id;
		this.address = address;
		this.salary = salary;
		this.leave =leave;
	}



	@Override
	public String toString() {
		return "EmployeeAgg [id=" + id + ", address=" + address + ", salary=" + salary + ", leave=" + leave + "]";
	}
	

	}

