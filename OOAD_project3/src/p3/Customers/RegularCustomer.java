package p3.Customers;
import p3.Store;

import p3.DayTracker;
import p3.Cars.Car;
import p3.Cars.Rental;
import p3.Cars.RentalListener;

import java.util.Map;

public class RegularCustomer extends Customer {

    public RegularCustomer(Store store) {
        super(store);
    }
    public String toString() {
        return "Regular Customer " + id;
    }
    public boolean canRent() {
        if(numCars < 3) {
            return true;
        }
        return false;
    }

    public void rent() {
        //casual customers only rent 1 car at a time
        double carsRenting = (int)(Math.random()*((3-1)+1))+1; //choosing number of cars renting
        if((this.numCars + carsRenting) > 3) {
            carsRenting = (3 - this.numCars); //if the number of cars to be rented went over 3, just max out your rentals
        }
        for(int i =0; i<carsRenting; i++) {
            Map<Integer, Object> car = store.randomCar(3, 5); //takes min days, max days
            store.rentCar(this, (String) car.get(0), (int) car.get(1), (String[]) car.get(2));
            this.numCars++;
        }
    }
}