package p3.Cars;

public class RadioDecorator extends CarDecorator{
    public RadioDecorator(Car c) {
        super(c);
    }

    public String toString() {
        return car.toString() + ", "+ totalCost() + " with radio";
    }

    public double totalCost() {
        return car.totalCost() + extraCost();
    }

    public double extraCost() {
        return 12;
    }
}
