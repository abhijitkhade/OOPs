package com.prowing.assosiation;

public class StudentId {
int rollno;
long mobno;

public StudentId(int rollno, long mobno) {
	super();
	this.rollno = rollno;
	this.mobno = mobno;
}
public StudentId() {
	super();
}
@Override
public String toString() {
	return "StudentId [rollno=" + rollno + ", mobno=" + mobno + "]";
}

}
