package polymorphism;

public class AmbigutyOverload {
	public void method(long i,int j) {
		System.out.println("method inside int i,long j");}
		
		public void method
				(long i,long j) {
			System.out.println("method inside long i,long j");
			
	}

}
