package p3.Cars;

import p3.DayTracker;
import p3.Customers.Customer;

public class Rental implements DayTracker{
	private Car car;
	private int daysLeft;
	private RentalListener[] listeners;
	
	public Rental(Car c, int daysRented, RentalListener[] rl) {
		car = c;
		daysLeft = daysRented;
		listeners = rl;
		
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
