package inheritance2;

public class vehicle {
	String fuel;
	String brand;

	public vehicle(String brand, String fuel) {
		this.brand = brand;
		this.fuel = fuel;
	}

	public void bike() {
		String bikeName = "duke";
		System.out.println("Bike Name :" + bikeName);
		System.out.println("Bike Brand :" + brand + "  Bike fuel :" + fuel);

	}

	public void car() {
		System.out.println("Car name: " + brand + "  Car Fuel:" + fuel);
		System.out.println("we can travell any temple with car");

	}

}
