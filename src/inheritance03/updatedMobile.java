package inheritance03;

public class updatedMobile extends mobile {
	
	int warenty;
	int version;

	public updatedMobile(String name,int cost,String location,int version,int warenty) {
		super(name,cost,location);
		this.version=version;
		this.warenty=warenty;
	}

	public void details() {
		System.out.println("mobile versionis: " + version);
	}

	public void manufacturing() {
		System.out.println("main branch is availabel in: " + location);
	}


}
