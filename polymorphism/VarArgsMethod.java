package polymorphism;

public class VarArgsMethod {
	public static void m1(int...numbers) {
		System.out.println("m1 inside (int...numbers)");
		int res=0;
		for(int i=0;i<numbers.length;i++)
		{System.out.println(numbers[i]);
			
		res+=numbers[i];
		}
		System.out.println("addition of var is :"+res);	
	}
public static void main(String[] args) {
	m1(10,20,30);
}
}
