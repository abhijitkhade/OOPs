package polymorphism;

public class VArMix {
	public static void add(Integer...numbers) {
		System.out.println("add inside (Integer...numbers) ");
	}
//		public static void add(int...numbers) {
//			System.out.println("add inside (int...numbers) ");
//		}
	public static void add(int num) {
		System.out.println("add inside (int num)");
	}
	//public static void add(long num) {
	//	System.out.println("add inside (long num)");
	//}
	public static void add(Integer num) {
		System.out.println("add inside (Integer num)");
	}
	public static void add(int num1,int num2) {
		System.out.println("add inside (int num1,int num2) ");
		int res=num1+num2;
		System.out.println(res);
		
	}
	public static void main(String[] args) {
		add(10,20,30);
	}
}
