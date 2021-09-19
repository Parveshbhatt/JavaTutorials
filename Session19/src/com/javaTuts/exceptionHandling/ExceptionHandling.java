package com.javaTuts.exceptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	static boolean debug = true;

	
	public static void main(String[] args) {
		
		System.out.println("Lucky Number Cashback App Started");
		
		
		// Error
		// Compile Time or Run Time
		
		Integer i = 10;
		
		Integer[] cashBacks = new Integer[] { 10, 12, 35, 17, 88, 90, 100, 5, 55, 6 };
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Lucky Number: ");
		try {
			
			Integer luckyNumber = scanner.nextInt();  // AutoBoxing
			System.out.println("CashBack Won is: \u20b9"+cashBacks[luckyNumber]);
			
			System.out.println("Additional CashBack of \u20b9 10");
		}/*catch(ArrayIndexOutOfBoundsException ref) {
			if(debug) {
				System.out.println("😂😂😂😂"+ref);
				ref.printStackTrace();
				
			}else {
				System.out.println("Something went wrong");
			}
		}*//*catch(InputMismatchException ref ) {
			if(debug) {
				System.out.println("😂😂😂😂"+ref);
				ref.printStackTrace();
				
			}else {
				System.out.println("Something went wrong");
			}
			
		}*/
	catch (Exception e) {  //RTP
		if(debug) {
			System.out.println(e);
			e.printStackTrace();
		}else {
			System.out.println("Something Went wrong: :"+e.getMessage());
			
		}
		
	   }finally {// Just before app crashing/ not crashes finally will be executed
		   System.out.println("Additional CashBack of \u20b910");
		   
	   }
		
		System.out.println("Lucky Number CashBack App finished");
		
		//Run Time Error -> Crashes the process and hence OS suffers
	}
	/*

	RTP -> Parent's reference can refer to any child object
	
	Throwable
			Exception      | CHECKED EXCEPTIONS
					RunTimeException | UNCHECKED EXCEPTIONS
								ArrayIndexOutOfBoundsexception
								NullPointerException
								ArithmeticException
								.
								..
								....
					IOException
								FileNotFoundException
								.
								..
								....
		            .
		            ..
		            ...
		            ....
		            


*/

/*

try{

}catch(){

}finally{

}

try{

}catch(){

}

try{

}finally{

}

try{

}catch(){

}
finally{

}

try{

}catch(){

}
catch(){

}
finally{

}

try{
   	try{
  
   }catch(){
   
   }
   finally{
   
   }

}catch(){
	   	try{
  
   }catch(){
   
   }
   finally{
   
   }  
}
finally{
	   	try{
  
   }catch(){
   
   }
   finally{
   
   }
}


*/

}




