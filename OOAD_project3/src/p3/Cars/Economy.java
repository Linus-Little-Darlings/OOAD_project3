package p3.Cars;

public class Economy extends Car {
	
	public Economy() {
		super(30);
	}
	public String toString() {
		return "Economy: " + plate + ", costs: " + cost();
	}
	public double cost() {
		return costPerDay * daysRented;
	}
}
