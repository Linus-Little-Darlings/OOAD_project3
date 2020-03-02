package p3.Cars;

public class Luxury extends Car {
	
	public Luxury() {
		super(70);
	}
	//@Override
	public String toString() {
		return "Luxury: " + plate + ", costs: " + totalCost();
	}

	public double totalCost() {
		return 70;
	}
	public double extraCost() {
		return 15;
	}
}
