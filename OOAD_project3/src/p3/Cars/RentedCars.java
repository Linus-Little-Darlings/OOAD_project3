package p3.Cars;

import p3.DayTracker;
import p3.Customers.Customer;

public class RentedCars implements DayTracker{
	private Car[] cars;
	private int daysLeft;
	private Customer customer;
	
	public RentedCars(Car[] c, int daysRented, Customer cust) {
		cars = c;
		daysLeft = daysRented;
		customer = cust;
	}
	
	public void passDay() {
		daysLeft--;
		if(daysLeft == 0) {
			for(Car c : cars) {
				customer.returnCar(c);
			}
		}
	}
}
