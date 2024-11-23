package inheritance4;

public class humanInformation extends human {
	String status;
	humanInformation(String gender,int age,String name,String status){
		super(gender,age,name);
		this.status=status;
		
	}
	public void man() {
		System.out.println("man can stay in land");
		System.out.println("man can make noise");
		System.out.println("man status is " + status);
	}
	public void female() {
		System.out.println();
		System.out.println("gender :"  + gender);
		System.out.println(gender +" name is : " +name);
		System.out.println(gender +" age is : " + age);
		System.out.println(gender + " status is "  + status);
		
	}
	
	

}
