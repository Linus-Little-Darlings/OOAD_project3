package p3;

public abstract class Customer {
	private String custType;
	//private CustomerBehavior behavior; //implementing strategy pattern with this
	private int carsRented = 0;

	public Customer(String type) {
		custType = type;
	}

	public String getCustomerType() {
		return custType;
	}

	public int getNumRentals() {
		return carsRented;
	}

	
}

