package p3.Cars;

public class Luxury extends Car {
	
	public Luxury() {
		super();
	}
	
	@Override
	public String toString() {
		return "Luxury: " + plate + ", costs: " + cost();
	}
	public double cost() {
		return 70;
	}

}
