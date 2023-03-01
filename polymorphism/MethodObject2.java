package polymorphism;

public class MethodObject2 {

	public void m1(Object a) {
		System.out.println("m1 inside Object a");
	}
	//public void m1(Character c) {
	//	System.out.println("inside m1 ( Character c)");
	//}
	//public void m1(Number a) {
	//	System.out.println("inside m1 (Number a)");
	//}
		
	  public void m1(long a,int b) {
		System.out.println("inside m1 (Integer a,int b)");
	}
	  public static void main(String[] args) {
		  MethodObject2 obj= new  MethodObject2();
		  Integer i=10;
		  obj.m1(i,10);
	}
	  }



