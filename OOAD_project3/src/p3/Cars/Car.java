package p3.Cars;

public abstract class Car {
	protected String plate;
	public Car() {
		plate = randomPlate();
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


	
	public abstract String toString();
	public abstract double totalCost();
	public abstract double extraCost();
}
