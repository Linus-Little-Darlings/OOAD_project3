package p3;

import p3.Cars.*;

public class SimpleCarFactory {
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
}
