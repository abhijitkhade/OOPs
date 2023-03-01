package com.prowing.assosiation;

public class StudentAggregation {
	StudentId id;
	String name;
	float mark;
	AdressStudent AdressStudent;
	
	public StudentAggregation() {
		super();
	}
	public StudentAggregation(StudentId id, String name, float mark, AdressStudent AdressStudent) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.AdressStudent = AdressStudent;
	}
//	@Override
//	public String toString() {
//		return "StudentAggregation [name=" + name + ", mark=" + mark + "]";
//	}
//	
	@Override
	public String toString() {
		return "StudentAggregation [id=" + id + ", name=" + name + ", mark=" + mark + ", AdressStudent=" + AdressStudent
				+ "]";
	}
	

}
