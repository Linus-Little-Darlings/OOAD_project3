package p3.Cars;

public class Minivan extends Car {
	public Minivan() {
		super(45);
	}
	@Override
	public String toString() {
		return "Minivan: " + plate + ", costs: " + cost();
	}
}
