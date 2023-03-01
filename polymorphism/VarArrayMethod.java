package polymorphism;

public class VarArrayMethod {
	public static void m1(float a,int...numbers) {
		System.out.println("inside m1(int...numbers)method");}
		
		
		public static void m1(long[]numbers) {
			System.out.println("inside m1(long[]numbers)method");
			
	}
		public static void main(String[] args) {
			long[]val= {20l,30l,40l};
			//m1(10,0);
			m1(val);
		}

}
