package p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import p3.Cars.Car;
import p3.Cars.CarSeatDecorator;
import p3.Cars.Economy;
import p3.Cars.GPSDecorator;
import p3.Cars.Luxury;
import p3.Cars.Minivan;
import p3.Cars.RadioDecorator;
import p3.Cars.Rental;
import p3.Cars.RentalListener;
import p3.Cars.SUV;
import p3.Cars.Standard;
import p3.Customers.Customer;

public class Store implements DayTracker, RentalListener {
	private CarPool inventory;
	private ArrayList<RentalRecord> activeRentals;
	private ArrayList<RentalRecord> rentalHistory;
	private OptionFactory optionFactory;
	
	public Store() {
		inventory = new CarPool(24);
		activeRentals = new ArrayList<RentalRecord>();
		rentalHistory = new ArrayList<RentalRecord>();
		optionFactory = new OptionFactory();
	}
	
	public void printInventory() {
		System.out.println("Current Inventory:");
		for(Car c : inventory.getCars()) {
			System.out.println(c);
		}
		System.out.println();
	}
	
	public void printActiveRentals() {
		System.out.println("Active Rentals:");
		for(RentalRecord r : activeRentals) {
			System.out.println(r);
		}
		System.out.println();
	}
	
	public void printRentalHistory() {
		System.out.println("Rental History:");
		for(RentalRecord r : rentalHistory) {
			System.out.println(r);
		}
		System.out.println();
	}
	
	public void rentCar(Customer cust, String carType, int days, String[] options) {
		Car c = inventory.getCarByType(carType); //sees if car type is availiable, decorates, and adds to cust rent
		if(c != null) {
			for(int i = 0; i < options.length; i++) {
				c = optionFactory.addOption(c, options[i]); //adding chosen options
			}
			System.out.println("Renting " + c + " to " + cust);

			activeRentals.add(new RentalRecord(c, cust, days));
			//cust.rent(new Rental(c, days, new RentalListener[] {this, cust})
		} else {
			System.out.println("Unable to rent " + carType + " to " + cust + ", none left in inventory.");
		}
	}
	
	public void returnCar(Car c) { //not working
		inventory.returnCar(c);
		for(RentalRecord r : activeRentals) {
			if(r.getCar().equals(c)) {
				activeRentals.remove(r);
				rentalHistory.add(r);
			}
		}
	}
	
	public void passDay() {
		
		return;
	}

	public static Map<Integer, Object> randomCar(int minDays, int maxDays){
		String[] carTypes = {"Economy", "Standard", "Luxury", "SUV", "Minivan"};

		int numSeats = (int)(Math.random() * 4);
		int gps = (int)(Math.random()*2);
		int radio = (int)(Math.random()*2);
		String[] chosenOptions = new String[numSeats + gps + radio];
		int j = 0;
		if(gps > 0) {
			chosenOptions[j] = "GPS";
			j++;
		}
		if(radio > 0) {
			chosenOptions[j] = "Radio";
			j++;
		}
		for(int k = j; k < numSeats + j; k++) {
			chosenOptions[k] = "Car Seat";
		}
		String chosenType = carTypes[(int)(Math.random() * carTypes.length)];
		int chosenDays = minDays + (int)(Math.random() * (maxDays - minDays + 1));
		Map<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(0, chosenType);
		map.put(1, chosenDays);
		map.put(2, chosenOptions);
		return map;
	}

}
