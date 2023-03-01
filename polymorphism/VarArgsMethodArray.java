package polymorphism;

public class VarArgsMethodArray {
	
	public static void m1(int[] numbers) {
		System.out.println("inside (int...numbers)");
	}
	public static void main(String[] args) {
//		byte b=10;
//		byte b1=12;

int[] val= {12,13,45};		
m1(val);
	}

}
