package p3;

import java.util.ArrayList;

import p3.Cars.Car;
import p3.Cars.CarSeatDecorator;
import p3.Cars.Economy;
import p3.Cars.GPSDecorator;
import p3.Cars.Luxury;
import p3.Cars.Minivan;
import p3.Cars.RadioDecorator;
import p3.Cars.SUV;
import p3.Cars.Standard;
import p3.Customers.Customer;

public class Store implements DayTracker {
	private ArrayList<Car> cars;
	
	public Store() {
		cars = new ArrayList<Car>();
		String[] carTypes = {"Economy", "Standard", "Luxury", "SUV", "Minivan"};
		for(int i = 0; i < 10; i++) {
			cars.add(createCar(carTypes[(int)(Math.random()*5)]));
		}
		/*
		 * Car c = new Luxury(); c = new CarSeatDecorator(c); c = new GPSDecorator(c); c
		 * = new RadioDecorator(c); c = new CarSeatDecorator(c);
		 * System.out.println("TESTCAR" + c);
		 */
		cars.get(2).rentOut(5);
		System.out.println(cars.get(2));
	}
	
	public void printCars() {
		for(Car c : cars) {
			System.out.println(c);
		}
	}
	
	public Car createCar(String type) {
		if(type.equals("Economy")) {
			return new Economy();
		} else if (type.equals("Standard")) {
			return new Standard();
		} else if (type.equals("Luxury")) {
			return new Luxury();
		} else if (type.equals("SUV")) {
			return new SUV();
		} else if (type.equals("Minivan")) {
			return new Minivan();
		}
		return null;
	}
	public void rentCar(Customer cust, String carType, String[] options) {
		System.out.println("Renting to " + cust);
	}
	
	public void passDay() {
		return;
	}
}
