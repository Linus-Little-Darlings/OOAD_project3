package p3.Cars;

public abstract class CarDecorator extends Car {
	Car car;
	public CarDecorator(Car c) {
		super(c.costPerDay);
		car = c;
	}
	//@Override
	public abstract String toString();
	public abstract double cost();
}
