package com.javaTuts.collections;

import java.util.PriorityQueue;

public class QueueAPI {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

//		queue.add(10);
//		queue.add(9);
		
		for(int i=10; i>0; i--) {
			queue.add(i);
		}
		
		// HEAD: 10 9 8 7 6 5 4 3 2 1 TAIL
		// PQ -> Sort the Data
		// HEAD : 1 2 3 4 5 6 7 8 9 10 TAIL
		
		System.out.println(queue);
		System.out.println("HEAD OF QUEUE: "+ queue.peek());
		
//		queue.poll(); // Remove the Head
//		System.out.println("HEAD OF QUEUE now: "+ queue.peek());
//		queue.poll();
//		System.out.println("HEAD OF QUEUE now2: "+ queue.peek());
//		
		for (int i=0; i<queue.size(); i++) {
			System.out.println(queue.peek());
			queue.poll();
		}
		
	}

}

