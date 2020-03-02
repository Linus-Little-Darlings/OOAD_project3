package p3.Customers;
import p3.Store;

import java.util.ArrayList;

import p3.DayTracker;
import p3.Cars.Car;
import p3.Cars.Rental;
import p3.Cars.RentalListener;

public abstract class Customer implements DayTracker, RentalListener {
	protected ArrayList<Car> rentedCars;
	protected int numCars;
	protected int id;
	private String custType;
	protected Store store;
	
	public Customer(Store store) {
		this.rentedCars = new ArrayList<Car>();
		this.id = (int)(Math.random() * 999);
		this.numCars = 0;
		this.store = store;
	}

	public String getCustomerType() {
		return custType;
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
	abstract public boolean canRent();
	abstract public void rent();
	//abstract public int maxDays();
}
