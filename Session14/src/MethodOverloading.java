class Payment{
	
 /*	void payFromWallet (int amount) {
		System.out.println("Amount Paid from Wallet");
	}
	
	void payFromUPI(int amount, String upi) {
		System.out.println("Amount Paid From UPI: "+upi);
	}
	
	void payFromBank(int amount, String userName, String password) {
		System.out.println("Amount Paid from Bank");
		System.out.println("UserName used: "+userName);
	}
	
	void payFromCard(int amount, String cardNumber, String name, int cvv, String expiry) {
		System.out.println("Amount Paid form Card");
		System.out.println("Card Details");
		System.out.println(cardNumber);
		System.out.println(name);
	}  */
	
	void pay(int amount) {
		System.out.println("Amount Paid from Wallet");
	}
	
	void pay(int amount, String upi) {
		System.out.println("Amount Paid from UPI: "+upi);
	}
	
	/*void pay(int total, String upiUserName) {
	System.out.println("Amount Paid from UPI:"+upiUserName);
	}*/ // error

	/*int pay(int amount, String upi) {
	System.out.println("Amount Paid from UPI:"+upi);
	return 0;
	}*/ // error
	
	
/*	      Signature of method     (This Signature is different from upper one)        
	_____________/\_________________                     
   /	                            \                              */
	void pay(String upi, int amount) {
		System.out.println("Amount Paid from UPI: "+upi);
	}
	
	void pay(int amount, String userName, String password) {
		System.out.println("Amount Paid from Bank");
		System.out.println("Username used: "+userName);
	}
	
	void pay(int amount, String cardNumber, String name, int cvv, String expiry) {
		System.out.println("Amount Paid from Card");
		System.out.println("Card Details");
		System.out.println(cardNumber);
		System.out.println(name);
	}
	
}

// Polymorphism
// Compile Time Polymorphism -> Method Overloading
// RULE1: Method Name Should be same
// RULE2: Method Must have Unique Inputs i.e. different
// RULE3: Return type plays no role


public class MethodOverloading {

	public static void main(String[] args) {
		
		Payment payment = new Payment();
		payment.pay(300);
		payment.pay(300, "8776944@paytm");
		payment.pay("8776944@googlepay", 300);
		payment.pay(300, "john.watson", "john@123");
		
	}
}
