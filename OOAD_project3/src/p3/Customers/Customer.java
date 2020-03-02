package p3.Customers;

import p3.Cars.Car;

public abstract class Customer {
	protected Car[] rentedCars;
	protected int numCars;
	protected int id;
	
	public Customer() {
		rentedCars = new Car[3];
		id = (int)(Math.random() * 999);
	}
	
	public void rent(Car c) {
		if(numCars < 3) {
			rentedCars[numCars] = c;
			numCars++;
		}else {
			System.out.println("This customer already has 3 cars rented");
		}
	}
	
	public void returnCar(Car c) {
		return;
	}
	
	abstract public String toString();
}
