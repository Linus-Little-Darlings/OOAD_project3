package p3.Customers;

import p3.Cars.Car;

public class CasualCustomer extends Customer {
	
	
	public String toString() {
		return "Casual Customer " + id;
	}
	public int minDays() {
		return 1;
	}
	public int maxDays() {
		return 3;
	}

}
