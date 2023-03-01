package polymorphism;

public class NewArray {
		public static void add(int num, long...numbers) 
		{
			System.out.println("inside add(int num) method");
			
			System.out.println("num : "+num);
			
			System.out.println(numbers);
			
		}

		public static void add(int num1, int num2) 
		{
			System.out.println("inside add(int num1, int num2) method");
			int res = num1 + num2;
			System.out.println(res);
		}

		
	public static void main(String[] args) {
			
			
			add(10, 20, 30);
			
		}
		
	}



