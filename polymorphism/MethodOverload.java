package polymorphism;

public class MethodOverload
{
	     int multiply(int a,int b) {
		return a*b;
	}
		    long multiply(int a,int b,long c) {
			return a*b*c;
		  }
		
			 float multiply(long a,int b,int c,int d) {
				return a*b*c*d;
			}
}
