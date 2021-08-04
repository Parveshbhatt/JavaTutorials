/*
 	
 	Model -> Arrays, OOPS[Objects]
 	Controller -> if/else operators loops
 	View -> Scanner and syso
 	
 	John owns a Credit Card | 1st transaction will begin from 1st month i.e. January
 	He can perform 1 transaction in 1 moth
 	10% interest | 10000 + 1000 -> 11000
 	
 	What min John can Pay -> eg: 3000
 	
 	Pay before you make any other transaction in next moth :)
 	
 	Goal:
 	The moment John makes a transaction show him the month of zero billing amount
 	and the amount to be paid in last month
 	
 	1: 10000 -> 1000 -> 11000
 	2: 3000
 	3: 3000
 	4: 3000
 	5: 2000
 	
 	
 	
 */

// => Code:
import java.util.Scanner;

public class Assignment {
	
	 static Scanner sc = new Scanner(System.in);
	 
	 int month;
	int amount;
	float interest=0.1f;
	float totalAmount = 0.0f;
	float emi;
	float paidAmount = 0.0f;
	float dues;
	int count;
	float remainingAmount ;
	float totalAmount2;
	float paidwithemi=0.0f;
	 
	  void transaction() {
		
			if (month==1) {
				takeInputs();
				System.out.println("Transaction is done");
				for(int month1= 2; month1 <=12; month1++) {
					 //paidAmount = emi * month1;
					paidAmount += emi;
					if((totalAmount-paidAmount)<=emi && (totalAmount-paidAmount) >0) {
						remainingAmount = totalAmount-paidAmount;
						paidAmount += remainingAmount ;
						System.out.println("Amount to be paid: "+paidAmount);
						System.out.println("zero billing month: "+(month1+1));
						System.out.println("The amount to be paid in "+(month1+1)+" month is: "+(remainingAmount));
					}
					
				}
			}else {
				if(count != month  && dues != 0) {
					System.out.println("First, Pay minimum EMI ");
					System.out.println("Want to pay EMI(y/n): ");
					 String dc = sc.next();
					if (dc.equals("y")) {
						pay();
						 
						 System.out.println("Now, you can do transaction :)");
						 System.out.println("Want to do transaction(y/n): ");
						  
						 dc = sc.next();
						 
						if (dc.equals("y")) {
						       transaction();
						}else {
							System.out.println("Ok, transaction not done");
						}
						
						
						
						
						
					}else {
						System.out.println("transaction not done");
					  }
					}else {
					
					takeInputs();
					
					System.out.println("transaction done");
					totalAmount2 = totalAmount + dues;
					
					System.out.println("totalAmount2:"+totalAmount2);
					
					totalAmount = totalAmount2;
					paidAmount=0.0f;
					for(int month1= month; month1 <=36; month1++) {
						 //paidAmount = emi * month1;
						paidAmount += emi;
						if((totalAmount-paidAmount)<=emi && (totalAmount-paidAmount) >0) {
							remainingAmount = totalAmount-paidAmount;
							paidAmount += remainingAmount ;
							System.out.println("Amount to be paid: "+paidAmount);
							System.out.println("zero billing month: "+(month1+1));
							System.out.println("The amount to be paid in "+(month1+1)+" month is: "+(remainingAmount));
							System.out.println("Now, the totalAmount is: "+totalAmount);
							}
						}
					}	
				}
	 }

	  void pay() {
		   count = month;
		 if (month == 1 ) {
			  System.out.println("First,  do transaction");
		  }else {
			  if(totalAmount>0){
				  
			  
		  System.out.println("paid minimum EMI");
		  if(totalAmount>=emi) {
			  dues = totalAmount- emi;
			  paidwithemi += emi;
			   
		  }else {
			  emi =totalAmount;
			  dues = totalAmount - emi;
			  System.out.println("paid, totalAmount, NO dues :)");
		  }
		  System.out.println("dues: "+dues);
		   totalAmount = dues;
		  }else {
			  System.out.println("NO dues, NO need to pay emi");
		  }
	  }	  
	
	 }
	  
	  void takeInputs() {
		  System.out.println("Enter the amount: ");
			 amount = sc.nextInt();
			 sc.nextLine();
			
		    totalAmount = amount + amount*interest;
			System.out.println("Total Amount for this transaction: "+totalAmount);
			
			System.out.println("Enter the minimum EMI: ");
			
		    emi = sc.nextFloat();
			sc.nextLine();
	  }
	 
	 
	 
	  
	  // main 
	public static void main(String[] args) {
					

		Assignment a1 = new Assignment();
		 String choice="", decision="" ;
		 
		 System.out.println("Hello, John\nWelcome...  :)\n***********************");
		 
		 for(a1.month=1; a1.month<=12; a1.month++) {
			 System.out.println("In "+a1.month+" month:");
			 System.out.println("Actions: transactions or pay minimum ");
			 System.out.println("Type 't' for transaction OR 'p' for pay ");
			 
			 choice = sc.next();
			 if(choice.equals("t")) {
				
				a1.transaction();
				 
		  }else if(choice.equals("p")){
			  
			  a1.pay();
			  System.out.println("Want to do transaction(y/n): ");
			  
				 decision = sc.next();
				 
				if (decision.equals("y")) {
					a1.transaction();
				}else {
					System.out.println("Ok, transaction not done");
				}
			  
		  }else {
				 System.out.println("enter valid input");
			 }
			 System.out.println("-------------------------------------\n");
	}
		
		
	}
	
}


