package encapsulationexample1;

public class encapsulationexample1 {
	public static void main(String[] args) {
		human human = new human();
		// human.setName("pradeep");
		// human.setAge(20);
		human.getName();
		System.out.println("name is :" + human.getName());
		human.getAge();
		System.out.println("age is : " + human.getAge());
	}

}
