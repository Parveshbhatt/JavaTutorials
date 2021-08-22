package com.javaTuts.rtp;


//class CA{
//abstract class CA{
//	
//	CA(){
//		System.out.println("CA object Constructed");
//	}
//	
//	void show() {
//		System.out.println("This is show of CA");
//	}
//}

// Pure concept to perform Abstraction :)
interface CA{
	
//	CA(){
//		System.out.println("CA object Constructed");
//	}
	
	// cannot have objects
	// neither we nor Run Time Environment can create its objects
	
	
	// Methods in Interface are by default public abstract
	void show() ;    // => public abstract void show();
}

// class CB implements CA -> This is not Parent Child Relationship
// We do'nt have object to object Inheritance here
class CB implements CA{ //extends CA{
	CB(){
		System.out.println("CB object Constructed");
	}
	
	public void show() {
		
		System.out.println("This is show of CB");
	}
}

interface Inf1{
	void show();
	void fun();
}

interface Inf2{
	void show();
	void hello();
}

//interface Inf4 implements Inf2{  ==> error
//	void show();
//	void hello();
//}

interface Inf3 extends Inf1, Inf2{
	
	
}

class CC implements Inf3{ //,Inf1,Inf2 {
	public void show() {
		System.out.println("show of CC");
	}
	
	public void fun() {
		System.out.println("fun of CC");
	}
	
	public void hello() {
		System.out.println("hello of CC");
	}
	
	void bye() {
		System.out.println("bye of CC");
	}
}




public class InterfaceApp {

	public static void main(String[] args) {
		
//		CA ca = new CA();  //it is allowed
		
		// Direct Object Construction
//		CB cb = new CB();
		
		// Polymorphic Statement
		// Earlier: Reference Variable of Parent can Refer to Child object
		// Now: Reference Variable of Interface can Refer to the object which implements it
		
		
		CA ca = new CB();
		ca.show();
		
		CC cc = new CC();
		cc.show();
		cc.fun();
		cc.hello();
		cc.bye();
		
		Inf1 i1 = new CC(); 
		i1.show();
		i1.fun();
//		i1.hello(); ==> error
//		i1.bye();
		
	    Inf1 i12 = cc;
	    i12.show();
	    
	    Inf2 i2 = new CC();
	    i2.show();
//	    i2.fun();
//	    i2.bye();   ==> error
	    
//	    CA cRef = (CB)i1; - |
//	    CC cRef = (CC)i1;   |
//	    cRef.show();         |
//	    cRef.hello();		  \- - ->  DownCasting 
//	    cRef.bye();
	   
	    Inf3 i3 = new CC();
	    
	    i3.hello();
	    i3.show();
	    i3.fun();
//	    i3.bye();   => error
		
	}

}
