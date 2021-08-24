package com.javatutorial.java8;

class User{
	
	String name;
	String phone;
	String email;
	
	User(){
		this("john");
		phone ="NA";
		email = name+"@example.com";
		System.out.println("Default Constructor");
	}
	
	User(String name){
		
		this.name = name;
		System.out.println("Parameterized Constructor");
	}

	User(boolean upgradeToPrime){
		this();
		System.out.println("Parameterized Constructor");
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}

class A{
	
	A(){
		
		this(10);
		System.out.println("A Default");
	}
	
	A(int a){
		System.out.println("A Parameterized "+a);
	}
}

class B extends A{
	
	B(){
//		super(11);
		System.out.println("B Default");
	}
	 B(String s1){
		 System.out.println("B s1:"+s1);
	 }
}

class C extends B{
	C(){
//		super("hello");
		System.out.println("C Default");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {

//		User user1 = new User(true);
//		System.out.println(user1);
		
		C c  = new C();
		
	}

}
