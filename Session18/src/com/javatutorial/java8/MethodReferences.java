package com.javatutorial.java8;

// MethodReference -> Monkey Patching(not 100%)

@FunctionalInterface
interface Payment{
	void pay(int amount);
}



public class MethodReferences {

	MethodReferences(){
		
	}
	
	MethodReferences(int amount){
		System.out.println("[CONSTRUCTOR]  Transaction Done");
		System.out.println("Amount Received Rs."+amount);
	}
	
	static void transaction(int amount) {
		System.out.println("[TRANSACTION]  Transaction Done");
		System.out.println("Amount Received Rs."+amount);
	}
	
	 void payAmount(int amount) {
		System.out.println("[PAY AMOUNT]  Transaction Done");
		System.out.println("Amount Received Rs."+amount);
	}
	 
	
	 
	public static void main(String[] args) {
		
		// 1. Method Reference -> Static Method
		
		Payment payment = MethodReferences::transaction;
		payment.pay(300);
		
		
		// 2. Method Reference -> Non Static Method
		MethodReferences refVar = new MethodReferences();
		Payment payment2 = refVar::payAmount;
		payment2.pay(200);
		
		
		// 3. Method Reference -> Constructors
		Payment payment3 = MethodReferences::new;
		payment3.pay(4000);
	}

}
