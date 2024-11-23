package inheritance;

public class inheritanceExample {
	public static void main(String[]args) {
		animal animal=new animal(10,"generic animal");
		animal.displayInfo();
		animal.speak();
		
		dog dog=new dog(20,"greek","golden retriever");
		dog.displayInfo();
		dog.speak();
	}
}
