package polymorphism;

public class ArrayVar {
	
public static void test(int... intArr) {
			System.out.println("int array");
		}

		public static void test(long[] longArr) {
			System.out.println("long array");
		}

		public static void test(char[] charArr) {
			System.out.println("char array");
		}
	public static void test(char... Arr) {
		System.out.println("char ...Arr");
		}
	public static void test(Number nm) {
		System.out.println("test nm");
		
		}
		public static void main(String[] args) {
			
		

			char[] nums = { 'a','b', };
			test(nums);
		// test(10);
		}

}



