package inheritance1;

public class Engine {
 float capcity;
 int power;
 int numberOfCylindre;
 
 public Engine() {
	 super();
 }
 
 
public Engine(float capcity, int power, int numberOfCylindre) {
	super();
	this.capcity = capcity;
	this.power = power;
	this.numberOfCylindre = numberOfCylindre;
}


@Override
public String toString() {
	return "Engine [capcity=" + capcity + ", power=" + power + ", numberofcylindre=" + numberOfCylindre + "]";
}
}
