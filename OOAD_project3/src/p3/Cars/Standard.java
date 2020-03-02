package p3.Cars;

public class Standard extends Car {
	public Standard() {
		super(40);
	}
	@Override
	public String toString() {
		return "Standard: " + plate + ", costs: " + cost();
	}
}
