package inheritance;

public class animal {
	int age;
	String name;
	public animal(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public void speak() {
		System.out.println("animal can make sound");
	}
	public void displayInfo() {
		System.out.println("name:" + name +"    age:" + age);
	}

}
