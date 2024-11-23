package inheritance2;

public class bmw extends vehicle {
	String music;
	String colour;

	public bmw(String brand, String fuel, String music, String colour) {
		super(brand, fuel);
		this.music = music;
		this.colour = colour;
	}

	public void bike() {

		System.out.println("bike colour is:  " + colour);
		System.out.println("we can enjoy " + music);
	}

	public void car() {

		System.out.println("going to any long tour we can enjoy:" + music);
		System.out.println("car can go very fast");
		System.out.println("car colour is " + colour);
	}

}
