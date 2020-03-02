package p3.Cars;

public class GPSDecorator extends CarDecorator{
    Car car;
    public GPSDecorator(Car c) {
        car = c;
        //super(c);
    }

    public String toString() {
        return car.toString() + ", "+ totalCost() + " with GPS";
    }

    public double totalCost() {
        return car.totalCost() + extraCost();
    }

    public double extraCost() {
        return car.extraCost() + 15;
    }
}
