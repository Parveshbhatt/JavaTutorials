package com.javaTuts.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListAPIs {

	public static void main(String[] args) {
	
		LinkedList<String> list = new LinkedList<String>(); // Circular Doubly Likedlist
		LinkedList<String> names = new LinkedList<String>();
		
//		ArrayList<String> = new ArrayList<String>();  // Dynamic Arrays;
//      THREAD-SAFE	
//		Vector<String> names = new Vector<String>(); //LinkedList
		
		//****add*****
		
//		list.add(0, "John");
//		list.add(1, "Jennie");
//		list.add(2, "kim");
		
		list.add("John");     //0
		list.add("Jennie");
		list.add("John");
		list.add("Fionna");
		list.add("Dave");
		list.add("Kim");	// size-1
		
		System.out.println("list is: ");
		System.out.println(list);
		
		names.add("Sia");
		names.add("Lee");
		names.add("Mike");
		
		//****remove*****
//		list.remove(0);
		
		//****update*****
		list.set(0, "John Watson");
		
		System.out.println("list now is: ");
		System.out.println(list);
		
		//****read 1*****
		String name = list.get(4);

		//****read many*****
		list.forEach((element)->{
			System.out.println(element);
		});
		
		list.addFirst("George");
		list.addLast("Harry");
		
		System.out.println("list now is:");
		System.out.println(list);
		
		list.pop();
		System.out.println("list now is:");
		System.out.println(list);
		
//		list.clear();
		System.out.println("list now is:");
		System.out.println(list);
		
		if(list.contains("Fionna")) {
			int idx = list.indexOf("Fionna");
			System.out.println("Fionna is in the list at index: "+idx);
			
		}
		
		list.addAll(names);
		System.out.println("list after addAll is: ");
		System.out.println(list);
		
		System.out.println(list.peek());
	}

}
