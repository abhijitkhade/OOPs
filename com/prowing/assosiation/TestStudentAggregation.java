package com.prowing.assosiation;

public class TestStudentAggregation {
	public static void main(String[] args) {
		
		StudentId id=new StudentId(101,956119261);
		AdressStudent adress=new AdressStudent("pune","india",415);
		StudentAggregation std1=new StudentAggregation(id,"ram",50.5f,adress);
		
		System.out.println(std1);
		//System.out.println(id.toString());
		//System.out.println(adress);
	}

}
