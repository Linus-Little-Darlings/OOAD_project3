package p3.Customers;

import p3.Customers.Customer;
import p3.Store;

import java.util.Map;

public class CasualCustomer extends Customer {
	
	public CasualCustomer(Store store) {
		super(store);
	}
	public String toString() {
		return "Casual Customer " + this.id;
	}
	public boolean canRent() {
		if(this.numCars < 3) {
			return true;
		}
		return false;
	}

	public void rent() {
 		//casual customers only rent 1 car at a time
		Map<Integer, Object> car = this.store.randomCar(1, 3); //takes min days, max days
		store.rentCar(this, (String)car.get(0), (int)car.get(1), (String[])car.get(2));
		this.numCars++;
		//cars will be added to the rental array in store's rentCar if needed
	}
}
