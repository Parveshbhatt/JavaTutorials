package com.google.rtp;

abstract class RazorPayPaymentGateway{
	
	static boolean isBankAvailable = true;
	
	final void pay(int amount) {
		if(isBankAvailable) {
			System.out.println("Welcome to Razorpay");
			System.out.println("Transacting an Amount of Rs."+amount);
			System.out.println("Thank You");
			onSuccess("Payment Successfully Transacted");
			
		}else {
			onFailure("Payment Transaction Failed", 401);
		}
	}
	
	abstract void onSuccess(String message);
	abstract void onFailure(String message, int errorCode);
}

class ZomatoPaymentPage extends RazorPayPaymentGateway{
	
//	error
//	 void pay(int amount) {
//		System.out.println("pay method is overriden in child");
//	}
	
	
	
	
	void onSuccess(String message) {
		System.out.println("====ZOMATO=====");
		System.out.println(message);
		System.out.println("Your order is Accepted :)");
	}
	
	void onFailure(String message, int errorCode) {
		
		System.out.println("====ZOMATO=====");
		
		System.out.println(message);
		if (errorCode == 401) {
			System.out.println("Bank UnAvailable");
			System.out.println("Please Try Again");
		}
		
		System.out.println("Order Not Accepted :(");
	}
}



public class PaymentGatewayApp {

	public static void main(String[] args) {
		
		ZomatoPaymentPage pay = new ZomatoPaymentPage();
		pay.pay(10000);
	}

}
