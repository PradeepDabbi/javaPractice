package inheritance;

public class dog extends animal {
	String breed;
	public dog(int age,String name,String breed) {
		super(age, name);
		this.breed=breed;
	}
	public void speak() {
		System.out.println("the dog barks");
	}
	public void displayInfo() {
//		displayInfo();
		System.out.println("Breed: " + breed + age + name);
	}

}
