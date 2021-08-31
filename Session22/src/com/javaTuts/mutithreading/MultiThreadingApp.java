package com.javaTuts.mutithreading;

import java.util.ArrayList;

//Asynchronous Programming
//Concurrent Programming

/*class Printer{
	void printDocument(String name, int numOfCopies) {
		for(int i=1;i<=numOfCopies;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  System.out.println("[PRINTER] Printing Document #"+i);
		}
	}
}*/

//Printer IS-A Thread :)

// 1. extends with Thread Class
class Printer extends Thread{
	
	String documentName;
	int numOfCopies;
	
	
	
	Printer(String documentName, int numOfCopies) {
		this.documentName = documentName;
		this.numOfCopies = numOfCopies;
	}

	public void run() {
		for(int i=1;i<=numOfCopies;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  System.out.println("[PRINTER] Printing Document "+documentName+" #"+i);
		}
	}

}

// Use Runnable if your class has to extends another class as per some logic
class LaserPrinter{
	
}

//1. implements Runnable and extends some other class

class MyPrinter extends LaserPrinter implements Runnable{
	String documentName;
	int numOfCopies;
	
	MyPrinter(){
		
	}
	
	MyPrinter(String documentName, int numOfCopies){
		this.documentName = documentName;
		this.numOfCopies = numOfCopies;
		
	}
	
	public void run() {
		for(int i=1;i<=numOfCopies;i++) {
			System.out.println("[MYPRINTER] Priniting "+documentName+" #"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
	
}


public class MultiThreadingApp {
	
	// main Thread 
	public static void main(String[] args) {
		System.out.println("[MAIN] App Started");
			
		// States of thread
		// Thread: NEW RUNNABLE TERMINATED   / Basic states
		// Thread: BLOCKED WAITING(TIME)
		
//		Printer printer = new Printer();
//		printer.printDocument("MultiThreading.pdf", 10);
		
		Printer printer = new Printer("MultiThreading.pdf", 10);
		System.out.println("1.STATE of  Printer: "+printer.getState());
		printer.start(); // This will internally executer the run method
		System.out.println("2.STATE of  Printer: "+printer.getState());
		
		try {
			// should be executed immediately after the start
			// will make printer thread to finish the execution completely and will make other threads to wait
			
			printer.join();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
//		MyPrinter myPrinter = new MyPrinter("LearningJava.pdf", 10);
//		myPrinter.start();  => error
		
		Runnable r = new MyPrinter("LearningJava.pdf", 10);
		Thread th = new Thread(r);
		th.start();
				
		printer.setName("John");
		th.setName("Fionna");
		Thread.currentThread().setName("Jack");
		
		
		printer.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.NORM_PRIORITY);
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		
		
		ArrayList<Integer> productPrices = new ArrayList<Integer>();
		productPrices.add(2000);
		productPrices.add(5000);
		productPrices.add(22000);
		productPrices.add(12000);
		productPrices.add(16000);
		productPrices.add(17000);
		
		productPrices.forEach((price)->{
			System.out.println("[MAIN] Product Price: "+price);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		System.out.println("Name of printer Thread is: "+printer.getName()+" and Priority is: "+printer.getPriority());
		System.out.println("Name of myPrinter Thread is: "+th.getName()+" and Priority is: "+th.getPriority());
		System.out.println("Name of main Thread is: "+Thread.currentThread().getName()+" and Priority is: "+Thread.currentThread().getPriority());
		
		System.out.println("3. STATE of printer: "+printer.getState());
		
		System.out.println("[MAIN] App Finished");

	}
}

