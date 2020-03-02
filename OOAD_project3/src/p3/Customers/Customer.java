package p3.Customers;

import java.util.ArrayList;

import p3.DayTracker;
import p3.Cars.Car;
import p3.Cars.Rental;
import p3.Cars.RentalListener;

public abstract class Customer implements DayTracker, RentalListener{
	protected ArrayList<Car> rentedCars;
	protected int numCars;
	protected int id;
	
	public Customer() {
		rentedCars = new ArrayList<Car>();
		id = (int)(Math.random() * 999);
	}
	
	public void rent(Car c) {
		if(numCars < 3) {
			rentedCars.add(c);
			numCars++;
		}else {
			System.out.println("This customer already has 3 cars rented");
		}
	}
	
	public void returnCar(Car c) {
		rentedCars.remove(c);
		numCars--;
	}
	
	public void passDay() {
//		for(Car r : rentedCars) {
//			r.passDay();
//		}
		return;
	}
	
	public int numCars() {
		return rentedCars.size();
	}
	
	abstract public String toString();
	abstract public int minDays();
	abstract public int maxDays();
}
