package com.javaTuts.rtp;

// Interface as a storage Container
// It will always have variables as final and static

interface Inf{
	
	int a = 10;  // by default it is, -> public static final int a =10;
	
	public static void show() {
		System.out.println("This is show in Inf");
		System.out.println("a is: "+a);
	}
}

class Impl implements Inf{
	
}

// Functional Interface => Interface to have only 1 method

@FunctionalInterface
interface ActionListener{
	
	void onClick();
}

class Button implements ActionListener{
	
	public void onClick() {
		
		System.out.println("onClick ");
	}
}





public class InterfaceAgain {
	 public static void main(String[] args) {
		
//		 Inf.a = 100; // error
		 System.out.println("a is : "+Inf.a);
		 
		 Inf.show();
		 
		 //if a is not in Impl class , It will look for it in its Interface
		 System.out.println("a is : "+Impl.a);
//		  Impl.show();  //error  
		 
//		 Button button = new Button();
	 ActionListener listener = new Button();
	 
		  // Anonymous Class :) // Singleton Design Pattern
		 
		 ActionListener listener1 = new ActionListener() { // -> new ActionListener() // to create a class with no name 
			 
			 public void onClick() {
				 System.out.println("Onclick , Button clicked");
			 }
			
		 };
		 
//		 listener = listener1;
		 
		 listener.onClick();

		 listener1.onClick();
	}
}
