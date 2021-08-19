
// Assignment: Code Inheritance Use Case from PayTM: https://paytm.com/recharge-bill-payment
import java.util.Scanner;
class Payment{
	int  amount;
	String userName;
	String upi;
	
	Payment(){
		
	}
	
	Payment(int amount, String userName, String upi) {
		this.amount = amount;
		this.userName = userName;
		this.upi = upi;
	}

	void pay(int amount) {
		System.out.println("Amount Paid from Wallet");
	}
	
	void pay(int amount, String userName,String upi) {
		System.out.println("Username used: "+userName);
		System.out.println("Amount Paid from UPI: "+upi);
	}
	
}

class MobileRecharge extends Payment{
	
	String operator;
	String rechargeType;
	String mobileNumber;
	
	MobileRecharge() {
		super();
	}
	
	MobileRecharge(int amount, String userName, String upi,String operator, String rechargeType, String mobileNumber){
		super(amount, userName, upi);
		this.operator = operator;
		this.rechargeType = rechargeType;
		this.mobileNumber = mobileNumber;
	}
	
	void pay() {
		super.pay(300);
		System.out.println("recharge done of: "+"\nAmount: Rs."+amount+"\nOperator: "+operator+"\nnumber: "+mobileNumber);
	}

	
	
}






public class PaytmAssignment {

	public static void main(String[] args) {
		MobileRecharge recharge  = new MobileRecharge(399, "abc", "2344@paytm", "jio", "Prepaid", "8899776655");
		
		System.out.println("Welcome ....\nWhat you want to do\nType 'q' for quit OR Type 'm' for mobileRecharge");
		Scanner sc = new Scanner(System.in);
		String ch;
		ch = sc.next();
		if(ch.equals("q")){
			System.out.println("Ok, Thank you");
		}else if(ch.equals("m")) {
			recharge.pay();
		}
		
		
		

	}

}
