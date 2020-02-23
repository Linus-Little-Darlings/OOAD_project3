package p3.Cars;

public class Minivan extends Car {
	public Minivan() {
		super();
	}
	@Override
	public String toString() {
		return "Minivan: " + plate + ", costs: " + cost();
	}
	public double cost() {
		return 45;
	}

}
