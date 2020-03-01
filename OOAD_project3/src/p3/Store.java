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
	private SimpleCarFactory manufacturer; //here we are doing a simple factory since there will not be different types of car manufacturers
	private ArrayList<Car> cars;
	
	public Store(SimpleCarFactory manufacturer) {
		this.manufacturer = manufacturer;
		generateCars();
	}

	private void generateCars() {
		cars = new ArrayList<Car>();
		String[] carTypes = {"Economy", "Standard", "Luxury", "SUV", "Minivan"};
		for(int i = 0; i < 10; i++) {
			cars.add(manufacturer.createCar(carTypes[(int)(Math.random()*5)]));
		}
	}
	
	public void printCars() {
		for(Car c : cars) {
			System.out.println(c);
		}
	}
}
