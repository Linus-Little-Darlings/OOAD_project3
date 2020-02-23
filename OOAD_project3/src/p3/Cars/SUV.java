package p3.Cars;

public class SUV extends Car {

	public SUV() {
		super();
	}
	@Override
	public String toString() {
		return "SUV: " + plate + ", costs: " + cost();
	}
	public double cost() {
		return 50;
	}

}
