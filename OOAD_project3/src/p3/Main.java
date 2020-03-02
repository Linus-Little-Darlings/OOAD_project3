package p3;

import java.util.HashMap;
import java.util.Map;

import p3.Customers.BusinessCustomer;
import p3.Customers.CasualCustomer;
import p3.Customers.Customer;
import p3.Customers.RegularCustomer;

public class Main {

	public static void main(String[] args) {
		int numCasual = 2;
		int numRegular = 1;
		int numBusiness = 1;

		int numCustomers = numCasual + numRegular + numBusiness;
		Store store = new Store();
		Customer c1 = new CasualCustomer(store);
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		//store.rentCar(c1, "Luxury", 5, new String[] {"Radio", "GPS", "Car Seat"});
		String[] options = {"Radio", "GPS", "Car Seat"};
		store.printInventory();
		store.printActiveRentals();

		Customer[] customers = new Customer[numCustomers];
		customers[0] = new BusinessCustomer(store);
		customers[1] = c1;
		customers[2] = new RegularCustomer(store);
		customers[3] = new CasualCustomer(store);

		int day = 0;
		for (; day < 2; day++) {
			System.out.println("Day #" + (day + 1));
			Customer activeCustomer;
			for (int i = 0; i < 3; i++) {
				activeCustomer = customers[(int) (Math.random() * numCustomers)];
				if (activeCustomer.canRent()) {
					activeCustomer.rent();
				} else {
					System.out.println(activeCustomer + " tried to rent a car but they aren't able to.");
				}
			}
			System.out.println();
			store.printInventory();
			store.printActiveRentals();
		}
	}
}
