package p3.Cars;

public class GPSDecorator extends CarDecorator {
	Car car;
	
	public GPSDecorator(Car c) {
		super(c);
	}
	@Override
	public String toString() {
		return car.toString() + ", "+ cost() + " with GPS";
	}

	@Override
	public double cost() {
		return car.cost() + 15;
	}

}
