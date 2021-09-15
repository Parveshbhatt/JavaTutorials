package com.google.rtp;

import java.util.Scanner;

public class App {
	
	//Factory Design Pattern
    static Payment transact(String choice) {
		 
		//RTP 
		
		Payment payment = null;
		
		
		
	/*	if(choice.equals("netbanking")) {
			payment = new NetBanking();
		}else if (choice.equals("upi")) {
			payment= new UPI();
		}else {
			System.out.println("Please Select a valid choice");
		}*/
		
		if(choice.contains("netbanking")) {
			payment = new NetBanking();
		}else if(choice.contains("upi")) {
			payment = new UPI();
			
		}else {
			System.out.println("Please select a valid choice");
		}
		
		return payment;
	}

	public static void main(String[] args) {

//		Payment payment = new Payment();
//		payment.pay(3000);
//		
//		Payment payment;
//		payment = new Payment();
//		payment.pay(3000);
		
//		Payment payment;
		// Polymorphic Statement
		// Reference of Parent can refer to Child Object
		
//		payment = new NetBanking();  // NetBanking IS-A Payment
//		payment.pay(3000);
		
//		payment = new UPI();
//		payment.pay(3000);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hi! I am john");
		System.out.println("How would like to transact?");
		String line = sc.nextLine();
		
//		transact("netbanking");
		Payment payment = transact(line);
		if(payment != null) {
			payment.pay(20000);
		}
//		
//	UPI upi = new UPI();
//	Payment p = (Payment)upi;
//	p.hello();
//		UPI upi = (UPI)payment;
//		upi.hello();
//		upi.show();
	
	 
		
		
	}

}
