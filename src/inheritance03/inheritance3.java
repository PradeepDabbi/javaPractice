package inheritance03;

public class inheritance3 {
	public static void main(String[]args) {
		mobile mobile=new mobile("apple",20000,"hyderabad");
		mobile.details();
		mobile.manufacturing();
		
		updatedMobile updatedMobile=new updatedMobile("apple",20000,"hyderabad",2,1);
		updatedMobile.details();
		updatedMobile.manufacturing();
		
	}


}
