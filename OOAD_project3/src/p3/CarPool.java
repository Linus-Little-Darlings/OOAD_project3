package p3;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;

import p3.Cars.Car;
import p3.Cars.Economy;
import p3.Cars.Luxury;
import p3.Cars.Minivan;
import p3.Cars.SUV;
import p3.Cars.Standard;

public class CarPool {
	private ArrayList<Car> cars;
	
	public CarPool(int size) {
		cars = new ArrayList<Car>(size);
		String[] carTypes = {"Economy", "Standard", "Luxury", "SUV", "Minivan"};
		for(int i = 0; i < size; i++) {
			cars.add(createCar(carTypes[(int)(Math.random()*5)]));
		}
	}

	//car SimpleFactory
	public Car createCar(String type) {
        Car car = null;
        //here is the factory method for cars
        if(type.equals("Economy")) {
            car = new Economy();
        } else if (type.equals("Standard")) {
            car = new Standard();
        } else if (type.equals("Luxury")) {
            car = new Luxury();
        } else if (type.equals("SUV")) {
            car = new SUV();
        } else if (type.equals("Minivan")) {
            car = new Minivan();
        }
        return car;
    }
	
	public Car getCarByType(String type) {
		for(Car c : cars) {
			if(c.getType().equals(type)) {
				cars.remove(c);
				return c;
			}
		}
		return null;
	}

	public ArrayList<Car> getCars(){
		return cars;
	}
	public void returnCar(Car c) {
		return;
	}
}
