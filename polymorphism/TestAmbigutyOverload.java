package polymorphism;

public class TestAmbigutyOverload {
	public static void main(String[] args) {
		AmbigutyOverload obj= new AmbigutyOverload();
		Integer i=10;
		obj.method(i, 20l);
		
	}

}
