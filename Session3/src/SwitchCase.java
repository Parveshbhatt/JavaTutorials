import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int eWallet =150;
		
		//IBU: Initialization Before Use Principle
		
		String typeOfCab = ""; //Declaring and using lately
		int baseFare =100;
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter Type of Cab: ");
		typeOfCab = scanner.nextLine();
		

		if(typeOfCab.equals("mini")) {
			baseFare += 50;
		}else if(typeOfCab.equals("sedan")) {
			baseFare += 100;
		}else if (typeOfCab.equals("bike")) {
			baseFare += 10;
		}else {
			System.out.println("Invalid cab Selection");
		}
		if(baseFare <= eWallet) {
			System.out.println("CAB BOOKED");
			System.out.println("Initial Fare: \u20b9"+baseFare);
		}else {
			System.out.println("Please recharge your wallet");
			System.out.println("Short of \u20b9"+(baseFare-eWallet));
		}
		
		int paymentMethod;
		System.out.println("Enter Payment method(1/2/3): ");
		paymentMethod = scanner.nextInt();

		scanner.close();
		
		switch (paymentMethod) {
		
			case 1: 
				System.out.println("Pay By UPI");
				break;
				
			case 2:
				System.out.println("Pay By Net Banking");
				break;
				
			case 3:	
				System.out.println("Pay By Card");
				break;
				
			default:
				System.out.println("Invalid Choice");
			
		}
	}

}
