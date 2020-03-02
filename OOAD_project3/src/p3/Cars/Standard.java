package p3.Cars;

public class Standard extends Car {
	public Standard() {
		super(40);
	}
	@Override
	public String toString() {
		return "Standard: " + plate + ", costs: " + totalCost();
	}

	public double totalCost() {
		return 40;
	}

	public double extraCost() {
		return 8;
	}
}
