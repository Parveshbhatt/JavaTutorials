package com.javaTuts.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// In java by default every class is the child of object class :)

class Song { // extends Object{

	static int idx; //Property of class
	
	int index; // Property of Object
	
	String track;
	String artists;
	float duration;
	
	Song nextSong;
	Song previousSong;
	
	Song(){
		
	}
	
	Song(String track, String artists, float duration){
		index = idx; 
		idx++;  // increment property of class by 1
		
		
		this.track = track;
		this.artists = artists; 
		this.duration = duration;
	}
	
	void showSong() {
		System.out.println("--------------------------------------------------");
		System.out.println("["+index+"] Track: "+track+"\t Artists: "+artists+"\t Duration: "+duration );
		System.out.println("--------------------------------------------------");
	}

	@Override
	public String toString() {
		return "Song [index=" + index + ", track=" + track + ", artists=" + artists + ", duration=" + duration
				+ ", nextSong=" + nextSong + ", previousSong=" + previousSong + "]";
	}
	
	

}



public class CollectionsApp {

	public static void main(String[] args) {
		
		Song song1 = new Song("some song1","john, jennie",5.5f);
		Song song2 = new Song("some song2","fionna, sia",4.5f);
		Song song3 = new Song("some song3","john, Maggie",6.5f);
		
		// Hetrogeneous
		
		// LinkedList -> Circular Double Linked List
		
		LinkedList  list1 = new LinkedList();
		list1.add(10);  // list1.add(new Integer(10);  //-> Auto Boxed
		list1.add(20);
		list1.add('A');
		list1.add("John");
		list1.add(song1);
		list1.add(song2);
		
		// Generics -> Type safety
//		LinkedList<Integer> list2 = new LinkedList<Integer>();
//		list2.add(10);
//		list2.add(20);
//		list2.add(10);
//		list2.add(30);
//		list2.add(40);
//		list2.add(50);
//		list2.add(50);
		
//		list2.add("John");
//		list2.add(Song1);
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("Fionna");
		list2.add("Dave");
		list2.add("Kim");
		list2.add("Jennie");
		
		LinkedList<Song> list3 = new LinkedList<Song>();
		list3.add(song1);
		list3.add(song2);
		list3.add(song3);
		
		System.out.println("list1 is: \n"+list1+"\n");
		System.out.println("list2 is: \n"+list2+"\n");
		System.out.println("list3 is: \n"+list3+"\n");
		
		System.out.println("Size of List1: "+list1.size());
		System.out.println("Size of List2: "+list2.size());
		System.out.println("Size of List3: "+list3.size());

		Object element = list1.get(4);
		System.out.println("Element at 4th index of list2 is: "+element);
		
		String name = list2.get(2);
		System.out.println("Element at 2nd index of list2 is: "+name);
		
		System.out.println("1. Iterating in List2 with FOR LOOP");
		for(int i=0; i<list2.size(); i++) {
		
			System.out.println(list2.get(i));
			/*  if(list2.get(i).equals("Jennie")) {
				list2.remove(i);
			} */
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("2. Iterating in list2 With ENHANCED FOR LOOP");
		for(String nm: list2) {
			System.out.println(nm);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("3. Iterating in list2 with Iterator");
		Iterator<String> itr = list2.iterator();
		
//		System.out.println(itr.next());
//		System.out.println(itr.next());
		
		while(itr.hasNext()) {
			String data = itr.next();
			if(data.equals("Jennie")) {
				itr.remove();
			}
			
			System.out.println(data);
		}
		
		System.out.println("List2 now is: "+list2);
		list2.remove(2);
		System.out.println("List2 now is: "+list2);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		System.out.println("4. Iterating in list2 with ListIterator");
		ListIterator<String> itr1 = list2.listIterator(); // In listIterator, can also iterates backward;
		
		while(itr1.hasNext()) {
			String data = itr1.next();
//			if(data.equals("kim")) {
//				itr1.remove();
//			}
			System.out.println(data);
		}
		
		System.out.println("Iterating backward :)");
		while(itr1.hasPrevious()) {
			String data = itr1.previous();
//			if(data.equals("kim")) {
//			itr1.remove();
//		}
			System.out.println(data);
		}
		
		System.out.println("5. Iterating in list2 with forEach Lambda Expression");
		list2.forEach((String e1)->{
			System.out.println(e1);
			});
		
		
		System.out.println("6.Iterating in list2 with Enumeration");
		Enumeration<String> enm = Collections.enumeration(list2);
		
		while(enm.hasMoreElements()) {
			String data = enm.nextElement();
			System.out.println(data);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(Object o: list1) {
			System.out.println(o);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		list1.forEach((o)->{
			System.out.println(o);
		});
		
		
		}
	}

