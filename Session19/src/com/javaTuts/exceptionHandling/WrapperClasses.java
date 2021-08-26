package com.javaTuts.exceptionHandling;

public class WrapperClasses {

	public static void main(String[] args) {
		
		//Primitive Type:
		// i is created in stack, 10 is a literal in constant and it get copied into stack
		
		int i=10;
		
		// i will remain in memory forever
		
		// Wrapper Class -> Integer
		// a primitive type can be represented as reference type
		// iRef is reference variable which refers to the object of class Integer in Heap
		
		Integer iRef = new Integer(10); // This is deprecated since java9 and mark for removal
		
		/*
		  FOR EVERY PRIMITIVE TYPE WE GOT WRAPPER CLASS
		  
		  int => Integer
		  float => Float
		  char => Character
		  double => Double
		  short => Short
		  long => Long
		  .
		  ....
		  
		  
		 */
		
		// Boxing | Explicit
		// Integer iRef1 = new Integer(i);
		
		// AutoBoxing | Implicit
		Integer iRef1 = i;  // -> Integer iRef1 = new Integer(i);
		
		
		
		// UnBoxing
		//  int j = iRef1.intValue();
		 
	 // Auto UnBoxing
	 //	 int j = iRef1;  // -> int j = iRef1.intValue();
		 
		 char ch='9';     
		 
		 Character cRef = new Character(ch);
		 char ch1 = cRef.charValue();
		 System.out.println(ch1);
		 
		 Character cRef1 ='a';
		 
		 if(Character.isDigit(cRef1)) {
			 System.out.println("ch is a Digit");
			 
		 }else {
			 System.out.println("Its not a Digit");
		 }
		 
		String phone ="9999911111";
		 String accountNumber = "43215";
		 
		 
		 int accNum = Integer.parseInt(accountNumber);
		 System.out.println(accNum+1);
		 
		 long phoneNum = Long.parseLong(phone);
		 
		 
		 /*

		 1. Objects Constructed in HEAP dynamically hence, memory cleanup can be taken care when not in use
		 2. We can work on Data Structure i.e. Reference Types for referring  to next and previous in case of LinkedList
		 3. We have utility methods in Wrapper classes to solve basic problems
		 
		 */
		 
		 // java 9 onwards we need to create objects in this way
		 Character cRef2 = Character.valueOf('A');
	}

}
