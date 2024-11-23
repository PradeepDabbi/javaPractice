package abstractMethod2;

public abstract class animal {
	String name;
	String street;
	String breed;//german
	public animal(String name,String street,String breed) {
		this.name=name;
		this.street=street;
		this.breed=breed;
	}
	public abstract void male();
	public void dog() {
		System.out.println("this dog name is "+ name);
		System.out.println("this dog street is "+street);
		System.out.println("this dog breed is "+ breed);
		System.out.println("this is a male dog");
		
		
	}

}
