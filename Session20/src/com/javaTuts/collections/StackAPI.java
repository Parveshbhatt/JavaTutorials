package com.javaTuts.collections;

import java.util.Stack;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class StackAPI {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
//		LinkedList<String> stack = new LinkedList<String>();
		
		stack.push("John");
		stack.push("Fionna");
		stack.push("Mike");
		stack.push("Dave");
		
//		stack.add("John");     //0
//		stack.add("Jennie");
//		stack.add("John");
//		stack.add("Fionna");
//		stack.add("Dave");
		
		System.out.println(stack.get(0));
		
		System.out.println(stack);
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println("\n1. Iterating with for loop");
		for(int i=0; i<stack.size();i++) {
			System.out.println(stack.get(i));
		}
		
		System.out.println("\n2.Iterating with Enhanced for loop");
		for(String str: stack) {
			System.out.println(str);
		}
		
		System.out.println("\n3.Iterating with forEach lambda expression");
		stack.forEach((e)->{System.out.println(e);});
		
		System.out.println("\n4.Iterating with Iterator");
		Iterator<String> itr = stack.iterator();
		
//		System.out.println(itr.next()); 
		
		while(itr.hasNext()) {
			String data = itr.next();
			
//			if(data.equals("Mike")) {
//				itr.remove();
//			}
			
			System.out.println(data);
		}
		

		
		System.out.println("\n5. Iterating with ListIterator");
		ListIterator<String> itr1 = stack.listIterator();
		
		while(itr1.hasNext()) {
			String data = itr1.next();
			System.out.println(data);	
		}
		
		while(itr1.hasPrevious()) {
			String data = itr1.previous();
			System.out.println(data);
		}
		
		System.out.println("\n6. Iterating with Enumeration");
		Enumeration<String> enm = stack.elements();
		
		while(enm.hasMoreElements()) {
			String data = enm.nextElement();
			System.out.println(data);
		}
	
	}

}
