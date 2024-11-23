package encapsulationexample1;

public class human {
	private String name="chintu";
	private int age;
	public  String getName() {
		return name;
		
		
	}
	public void setName(String name) {
		this.name=name;
		
	
	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		if(age>0) {
		this.age=age;

		}
	}

}
