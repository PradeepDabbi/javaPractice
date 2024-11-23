package inheritance4;

public class inheritanceExample4 {
	public static void main(String[]args) {
		human human=new human("male",20,"arjun");
				human.man();
		humanInformation humanInformation= new humanInformation("female",19,"chithra","single");
		humanInformation.man();
		humanInformation.female();
	}

}
