package com.google.rtp;

//  public class Payment {
//	
//	String date;
//	String time;
//	String userId;
//	String amount;
//	
//	void show() {
//		System.out.println("show of payment");
//	}
//	
//	Payment(){
//		System.out.println("Payment Object Constructed");
//	}
//	
//	void pay(int amount) {
//		System.out.println("Paying Rs."+amount);
//	}
//
//} 

abstract public class Payment { // Payment can't have direct objects
	//  but RULE of Inheritance will remain intact
	
	
	String date;
	String time;
	String userId;
	String amount;
	
	Payment(){
		System.out.println("Payment Object Constructed");
	}
	
//	void pay(int amount) {
//		System.out.println("Paying Rs."+amount);
//	}
	
 void show() {
    	 System.out.println("===========================");
    	 System.out.println("Welcome to Payments Page");
    	 System.out.println("===========================");

     }

     
     // RULE created by Parent for Child
     // if we have n abstract methods in Parent, all children must define all the n methods
     abstract void pay(int amount);
}





class NetBanking extends Payment{

	NetBanking(){
		System.out.println("NetBanking Object Constructed");
	}
	
	void inputUsernNameAndPassword(String userName, String password){
		System.out.println("Transacting for User: "+userName);
	}
	
	void pay(int amount) {
		inputUsernNameAndPassword("john.watson", "pass123");
		System.out.println("Paying By NetBanking Rs."+amount);
	}
}

class UPI extends Payment{
	
	UPI(){
		System.out.println("NetBanking Object Constructed");
	}
	
	void inputUPI(String upiId){
		System.out.println("Transacting for UPI: "+upiId);
	}
	
	void pay(int amount) {
		inputUPI("john.watson@paytm");
		System.out.println("Paying By UPI Rs."+amount);
	}

	
	void hello() {
		System.out.println("Hello from UPI");
	}
}
