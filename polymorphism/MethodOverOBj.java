package polymorphism;

public class MethodOverOBj 
{
  public void m1(Integer a) {
	System.out.println("inside m1 (Integer a)");
}
  {
	  public void m1(Number a,Character c) {
		  System.out.println("inside m1 (Integer a)");
	  }
public void m1(Long a) {
	System.out.println("inside m1 (Long a)");
}
public void m1(Number a) {
	System.out.println("inside m1 (Number a)");
}
public void m1(Object a) {
	System.out.println("inside m1 (Object a)");
}
public void m1(long a) {
System.out.println("inside m1 (long a)");
}
public void m1(Character a) {
	System.out.println("inside m1 (long a)");
}
public static void main(String[] args) {
	MethodOverOBj obj= new MethodOverOBj();
	//Integer i=10;
	//obj.m1(null);
	//obj.m1(100);
	obj.m1(null);
}
  }
