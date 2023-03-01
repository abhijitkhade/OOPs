package inheritance1;

public class TestAggregation {
	public static void main(String[] args) {
		Engine engine=new Engine(1.2f,1200,4);
		
	Car car1=new Car("BmW",null,2021);
	
	//System.out.println(car1);
	car1.toString();
	System.out.println(car1.toString());
	
	System.out.println(engine);
	}

}
