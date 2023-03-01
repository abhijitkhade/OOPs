package com.prowing.polymorphisam.overriding;

public class Overriding {
	
	
	public static void main(String[] args) {
		Shape s= new Circle();
		s.draw();
		s.fill();
	}
	
	
	
	class Shape {
		public void draw() {
			System.out.println("inside shape draw");
		}
		public void fill() {
			System.out.println("inside shape fill with colour");
		}
	}
	
class Circle extends Shape{
	public void draw() {
		System.out.println("circle");
	}
	class Squre extends Shape{
	
	public  void	 draw() {
			System.out.println("Squre");
		}
		class Hexagoan extends Shape{
			public void draw() {
				System.out.println("Hexagoan");
			}
}
	


}
	}
}
}
}


	


