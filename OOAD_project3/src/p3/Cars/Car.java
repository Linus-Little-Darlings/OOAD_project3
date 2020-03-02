package p3.Cars;

public abstract class Car {
	protected String plate;
	protected int daysRented;
	protected double costPerDay;
	public Car(double costPerDay) {
		plate = randomPlate();
		this.costPerDay = costPerDay;
		this.daysRented = 0;
	}
	
	private String randomPlate() {
		String result = "";
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String nums = "";
		for(int i = 0; i < 3; i++) {
			result += letters.charAt((int)(Math.random() * 26));
			nums += Integer.toString((int)(Math.random() * 10));
		}
		result += nums;
		return result;
	}
	
	public void rentOut(int numDays) {
		daysRented = numDays;
	}
	
	public abstract String toString();
	public double cost() {
		return daysRented * costPerDay;
	};
}
