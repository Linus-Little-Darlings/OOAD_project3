package p3.Cars;

import p3.DayTracker;
import p3.Customers.Customer;
//need to create total cost
public class Rental implements DayTracker{
	private Car car;
	private int daysLeft;
	private RentalListener[] listeners; //pass
	private Customer renter;
	
	public Rental(Car c, int daysRented, RentalListener[] rl, Customer renter) {
		car = c;
		daysLeft = daysRented;
		listeners = rl;
		renter = renter;
	}
	
	public Car getCar() {
		return car;
	}
	
	public void passDay() {
		daysLeft--;
		if(daysLeft == 0) {
			for(RentalListener listener : listeners) {
				listener.returnCar(car);
			}
		}
	}
}
