package polymorphism;

public class Child2 extends Parent2Down {
public static void method() {
	System.out.println("in side child");
	
}
public static void main(String[] args) {
	Parent2Down p = new Child2();// Downcasting
	//Child2 c2=(Child2)p;          // Upcasting
	p.method();
}
}
