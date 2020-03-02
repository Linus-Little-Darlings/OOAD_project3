package p3.Cars;

public class RadioDecorator extends CarDecorator {
	Car car;
	
	public RadioDecorator(Car c) {
		super(c);
	}
	@Override
	public String toString() {
		return car.toString() + ", "+ cost() + " with Radio";
	}

	@Override
	public double cost() {
		return car.cost() + 12;
	}
}
