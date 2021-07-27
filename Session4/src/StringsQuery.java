import java.util.Scanner;
public class StringsQuery {

	public static void main(String[] args) {
		
		int i=10;
		System.out.println("i is: "+i); //primitive type
		
		
		String promoCode=""; //Declaring and using lately -> IBU: Initialization Before use 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter promoCode: ");
		promoCode=sc.nextLine();
		sc.close();
		
		System.out.println("promo code is: "+promoCode); //java by default or automatically add .toString() method to give values of string
		
		//Strings are not primitive type they are REFERENCE TYPES
		//promoCode is a reference variable which will hold hashCode of JUMBO
		
		
		System.out.println("promo code is: "+promoCode.toString());
		
		if (promoCode.equals("JUMBO")) {
			System.out.println("Discount is available");
		}else {
			System.out.println("Sorry, Discount is not available");
		}

	}

}
