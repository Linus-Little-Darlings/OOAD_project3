package p3.Customers;
import p3.RentalRecord;
import p3.Store;

import java.util.ArrayList;

import p3.DayTracker;

public abstract class Customer {
	protected ArrayList<RentalRecord> rentedCars;
	protected int numCars;
	protected int id;
	protected String custType;
	protected Store store;
	
	public Customer(Store store) {
		this.rentedCars = new ArrayList<RentalRecord>(); //rental record array to make sure that ??
		this.id = (int)(Math.random() * 999);
		this.numCars = 0;
		this.store = store;
	}

	public void addRental(RentalRecord r) {
		this.rentedCars.add(r);
	}

	public int getID() {
		return id;
	}

	protected int daysToRent(int minDays, int maxDays) {
		int chosenDays = minDays + (int)(Math.random() * (maxDays - minDays + 1));
		return chosenDays;
	}

	public String getCustomerType() {
		return custType;
	}

	public void returnCar(RentalRecord r) {
		rentedCars.remove(r);
		numCars--;
	}

	public ArrayList<RentalRecord> getRentedCars() {
		return rentedCars;
	}

	
	abstract public String toString();
	abstract public boolean canRent();
	abstract public void rent();
	//abstract public int maxDays();
}
