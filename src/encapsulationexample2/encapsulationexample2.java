package encapsulationexample2;

public class encapsulationexample2 {
	public static void main(String[]args) {
		vehicle vehicle=new vehicle();
		vehicle.setName("bmw");
		System.out.println("vehicle Name : "+ vehicle.getName());
		vehicle.setName("audi");
		System.out.println("vehicleName is "+vehicle.getName());
		vehicle.setName("benz");
		
		System.out.println("vehicleName is : "+vehicle.getName());
		vehicle.setName("Thar");
		System.out.println("vehicleName is : "+vehicle.getName());
	}
	

}
