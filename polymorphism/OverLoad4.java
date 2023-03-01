package polymorphism;

public class OverLoad4 {
	
	public static void test(int[] intArr) {
			System.out.println("int array");
		}

		public static void test(long[] number) {
			System.out.println("long array");
		}

		public static void test(char[] charArr) {
			System.out.println("char array");
		}

		public static void main(String[] args) {
			//long[] val = { 'a',1,2,3,4,5 };
			//test(val);
			test(null);
		}

	}



