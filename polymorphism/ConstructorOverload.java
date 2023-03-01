package polymorphism;

public class ConstructorOverload {
	int roll;
	String name;
	public ConstructorOverload() {
		super();
	}
	public ConstructorOverload(int roll) {
		super();
		this.roll = roll;
	}
	public ConstructorOverload(String name) {
		super();
		this.name = name;
	}
	public ConstructorOverload(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public ConstructorOverload(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
public static void main(String[] args) {
	int roll=10;
	String name="abhi";
	ConstructorOverload obj=new ConstructorOverload(roll,name);
	System.out.println(obj.roll);
	System.out.println(obj.name);
	
}
}
