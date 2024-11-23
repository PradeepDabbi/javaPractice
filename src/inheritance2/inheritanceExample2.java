package inheritance2;

public class inheritanceExample2 {
	public static void main(String[] args) {
		vehicle vehicle = new vehicle("yamaha", "petrol");
		vehicle.bike();
		vehicle.car();
		bmw bmw = new bmw("audi", "petrol", "songs", "red");
		bmw.bike();
		bmw.car();
	}

}
