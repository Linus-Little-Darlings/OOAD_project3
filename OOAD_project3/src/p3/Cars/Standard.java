package p3.Cars;

public class Standard extends Car {
	public Standard() {
		super();
	}
	@Override
	public String toString() {
		return "Standard: " + plate + ", costs: " + cost();
	}
	public double cost() {
		return 40;
	}

}
