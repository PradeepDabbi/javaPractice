package inheritance4;

public class human {
	String gender;
	int age;
	String name;
	human(String gender,int age,String name){
		this.gender=gender;
		this.age=age;
		this.name=name;
	}
	public void man() {
		System.out.println("gender :"  + gender);
		System.out.println(gender +" name is : " +name);
		System.out.println(gender +" age is : " + age);
		
	}

}
