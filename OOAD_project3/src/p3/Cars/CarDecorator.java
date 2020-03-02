package p3.Cars;

public abstract class CarDecorator extends Car {
	public Car car;
	public CarDecorator(Car c) {
		super(c.costPerDay);
		car = c;
	}
	public String getType() {
		return car.getType();
	}
	
	//@Override
	public abstract String toString();
	public abstract double totalCost();
	public abstract double extraCost();
}
