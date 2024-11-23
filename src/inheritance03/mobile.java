package inheritance03;

public class mobile {

	String name;
	int cost;
	String location;

	public mobile(String name, int cost, String location) {
		this.name = name;
		this.cost = cost;
		this.location=location;
	}

	public void details() {
		System.out.println("mobile Name is : " + name);
		System.out.println("mobile Cost is :  " + cost);
	}

	public void manufacturing() {
		System.out.println("location : " + location);
	}

}
