package com.javaTuts.exceptionHandling;

import java.io.IOException;


//USER DEFINED EXCEPTION
// MyBankingException IS-A RuntimeException  |UNCHECKED
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

// YourBankingException IS A Exception  | CHECKED
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}


class BankAccount{
	
	String name;
	int balance;
	int attempts;
	
	static int minBalance = 2000;
	
	BankAccount(String name){
		this.name = name;
		balance =10000;
	}
	
	void withdraw(int amount) throws IOException, YourBankingException{
		
		balance -= amount;
		
		if(balance< minBalance) {
			attempts++;
			balance += amount;
			System.out.println("WITHDRAW *FAILED* "+name+"'s Balance is Low: Rs."+balance);
		}else {
			System.out.println("WITHDRAW SUCCESS. "+name+"'s New Balance is: Rs."+balance);
		}
		
		if(attempts == 3) {
			
			// throwing an UNCHECKED EXCEPTION
			 //ArithmeticException ref = new ArithmeticException("Illegal Attempts");
			// throw ref;
//			IOException ref = new IOException("Illegal attempts ");
//			 throw ref;
			
//			MyBankingException exception = new MyBankingException("Illegal Exception");
//			throw exception;
			
			YourBankingException exception = new YourBankingException("Illegal Exception");
			throw exception;
			
			
		}
		
	}
	
	void show() {
		System.out.println(name+" has a balance of Rs."+balance);
	}
	
}



public class BankingApp {

	public static void main(String[] args) {
		
		System.out.println("Banking App start");
		
	   BankAccount account1 = new BankAccount("John");
	   BankAccount account2 = new BankAccount("Fionna");
	   

	   account1.show();
	   account2.show();
	   
	   try {
		   
		   for(int i =1; i<=10; i++) {
			   account2.withdraw(3000);
		   }
	   }catch(Exception e) {
		   System.out.println("Something went wrong: "+e);
	   }
	   
	   System.out.println("Banking app Finished");
	}

}
