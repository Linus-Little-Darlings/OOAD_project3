package p3.Cars;

public class SUV extends Car {

	public SUV() {
		super(50);
	}
	//@Override
	public String toString() {
		return "SUV: " + plate + ", costs: " + totalCost();
	}

	public double totalCost() {
		return 50;
	}

	public double extraCost() {
		return 10;
	}


}
