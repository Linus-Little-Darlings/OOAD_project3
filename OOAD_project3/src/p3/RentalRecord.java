package p3;

import p3.Cars.Car;
import p3.Customers.Customer;

public class RentalRecord {
	private Car car;
	private Customer customer;
	private int daysRented;
	private double totalCost;
	
	public RentalRecord(Car c, Customer cust, int days) {
		customer = cust;
		car = c;
		daysRented = days;
		totalCost = c.totalCost() * daysRented;
	}

	public Car getCar() {
		return car;
	}
	public String toString() {
		return customer + " rented: " + car + " for " + daysRented + " days and paid $" + totalCost;
	}
}
