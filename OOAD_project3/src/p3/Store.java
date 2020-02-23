package p3;

import java.util.ArrayList;

import p3.Cars.Car;
import p3.Cars.CarSeatDecorator;
import p3.Cars.Economy;
import p3.Cars.Luxury;
import p3.Cars.Minivan;
import p3.Cars.SUV;
import p3.Cars.Standard;

public class Store {
	private ArrayList<Car> cars;
	
	public Store() {
		cars = new ArrayList<Car>();
		String[] carTypes = {"Economy", "Standard", "Luxury", "SUV", "Minivan"};
		for(int i = 0; i < 10; i++) {
			cars.add(createCar(carTypes[(int)(Math.random()*5)]));
		}
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
}
