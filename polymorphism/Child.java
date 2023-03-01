package polymorphism;

public class Child extends Parent1{
		public void method() {
			System.out.println("inside child");
		}
		public static void main(String[] args) {
			//Parent1 p1=new Parent1();
			Parent1 p2=new Child();
        //    Child c = new Child();
            Child c2= (Child)p2;
           // c2.method();
            
           // Child c1= (Child)p2;
           // c1.method();
            p2.method();
            
            
            
            //p1.method();
             // p2.method();
             // c.method();
		}
	

}



