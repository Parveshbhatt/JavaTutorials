package com.javatutorial.java8;

@FunctionalInterface // Feature of Java8
interface MessageReceiver{
	void onMessageRecieved(String message);
}

@FunctionalInterface  
interface Comparison{
	String compareString(String s1, String s2);
}


class WhatsAppGroup implements MessageReceiver{
	
	@Override
	public void onMessageRecieved(String message) {
		System.out.println("A new Message");
		System.out.println(message);
	}
}


//Main class
public class LambdaApp {

	// Main method 
	// From here our execution begins ;)
	public static void main(String[] args) {
//		MessageReceiver refVar = new WhatsAppGroup();
//		refVar.onMessageRecieved("Hello, are you there?");

		// Anonymous class :) // SINGLETON
		// 1 and only 1 Object :)
		
//		MessageReceiver refVar = new MessageReceiver() {
//			
//			@Override
//			public void onMessageRecieved(String message) {
//				System.out.println("A new Message");
//				System.out.println(message);
//			}
//		};
//		
//		refVar.onMessageRecieved("Hello, how are you?");
		
		// Lambda :) 
//		MessageReceiver refVar = (text)->{
//			System.out.println("A new Message");
//			System.out.println(text);
//		};
//		
//		refVar.onMessageRecieved("Hello, what's up?");

		// Lambda for comparison
		Comparison compare = (str1, str2)-> {
			return (str1.equals(str2))? "Yes":"No";
		};
		
		System.out.println("are the strings equals: "+compare.compareString("Hello","hello"));
	}

}
