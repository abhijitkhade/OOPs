package polymorphism;

public class Method2argument {
		//public void m1(byte a, b) {
			//System.out.println("m1 inside int a int b");}
			
			public void m1(long a,long b) {
				System.out.println("m1 inside  a Integer long b");
				
		}
			public static void main(String[] args) {
				Method2argument obj= new Method2argument();
				Integer i=20;
				obj.m1(i, 20);
			}
		
	}


