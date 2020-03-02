package p3.Cars;

public class RadioDecorator extends CarDecorator{

    Car car;
    public RadioDecorator(Car c) {
        car = c;
        //super(c);
    }

    public String toString() {
        return car.toString() + ", "+ totalCost() + " with car seat";
    }

    public double totalCost() {
        return car.totalCost() + extraCost();
    }

    public double extraCost() {
        return car.extraCost() + 12;
    }
}
