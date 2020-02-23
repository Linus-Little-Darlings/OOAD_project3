package p3.Cars;

public class CarSeatDecorator extends CarDecorator {
	Car car;
	public CarSeatDecorator(Car c) {
		car = c;
		//super(c);
	}
	@Override
	public String toString() {
		return car.toString() + ", "+ cost() + " with car seat";
	}

	@Override
	public double cost() {
		return car.cost() + 10;
	}

}
