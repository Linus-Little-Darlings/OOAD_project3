package p3;

import java.util.HashMap;
import java.util.Map;

import p3.Customers.CasualCustomer;
import p3.Customers.Customer;

public class Main {

	public static void main(String[] args) {
		int numCasual = 2;
		int numRegular = 0;
		int numBusiness = 0;
		
		int numCustomers = numCasual + numRegular + numBusiness;
		Store store = new Store();
		Customer c1 = new CasualCustomer();
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		String[] options = {"Radio", "GPS", "Car Seat"};
		store.printInventory();
		store.printActiveRentals();
		
		Customer[] customers = new Customer[numCustomers];
		customers[0] = new CasualCustomer();
		customers[1] = c1;
		
		int day = 0;
		for(; day < 2; day++) {
			System.out.println("Day #"+(day+1));
			Customer activeCustomer;
			for(int i = 0; i < 3; i++) {
				activeCustomer = customers[(int)(Math.random() * numCustomers)];
				if(activeCustomer.numCars() < 3) {
					Map<Integer, Object> car = randomCar(activeCustomer.minDays(), activeCustomer.maxDays());
					store.rentCar(activeCustomer, (String)car.get(0), (int)car.get(1), (String[])car.get(2));
				}else {
					System.out.println(activeCustomer + " tried to rent a car but they already have 3.");
				}
			}
			System.out.println();
			store.printInventory();
			store.printActiveRentals();
		}
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
