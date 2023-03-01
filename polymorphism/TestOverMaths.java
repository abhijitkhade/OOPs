package polymorphism;

public class TestOverMaths {
	public static void main(String[] args) {
		MethodOverload maths=new MethodOverload();
		System.out.println(maths.multiply(10,20));
		System.out.println(maths.multiply(10, 200, 300));
		System.out.println(maths.multiply(10, 200, 50, 60));
		
		
		
		
		//System.out.println(MethodOverload.multiply(10, 200));
		//System.out.println(MethodOverload.multiply(10, 10, 30));
	}

}
