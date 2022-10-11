package week1.day1;

public class Mobile {
	String mobileBrandname = "Iphone";
	char mobileLogo = 'i'; 
	short noOfmobilePiece = 2000;
	int modelNumder = 934257521;
	long mobiliemeiNumber = 76647857854439868L;
	float mobilePrice = 90000.75F;
	boolean isDamage = false;
	private String modelNumber;
	public static void main(String[] args) {
		Mobile details = new Mobile(); 
		System.out.println("Brand Name ="+details.mobileBrandname);
		System.out.println("Mobile Logo ="+details.mobileLogo);
		System.out.println("Piece ="+details.noOfmobilePiece);
		System.out.println("Model Number ="+details.modelNumber);
		System.out.println("imei Number="+details.mobiliemeiNumber);
		System.out.println("Pice ="+details.mobilePrice);
		System.out.println("Is Damage ="+details.isDamage);
	}
}
