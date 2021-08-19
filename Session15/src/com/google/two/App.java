package com.google.two;

import com.google.one.One;
//import com.google.one.Two;  => error // Two is default class so, its not accessible here

class Three extends One{
	
	void show() {
		
//		showPvt(); //error  // accessible only in class, it is most secure
//		showDef(); //error  // accessible only in package
		showProt();  // ok, protected is accessible in package and child outside the package
		
//		showPub(); //ok, public is accessible everywhere
		
	}
}


public class App {

	public static void main(String[] args) {
		
		One one = new One();
//		Two two = new Two();
		
//		one.showPvt(); // error
		
//		one.showDef();  // error
		
//		one.showProt();  // accessible in child class
		
		one.showPub();
		System.out.println("THREE IN ACTION");

		Three three = new Three();
//		three.showProt(); // error
		three.show();
	}

}

//Accessibility : private < default < protected < public
