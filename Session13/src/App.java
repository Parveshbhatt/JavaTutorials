
public class App {

	public static void main(String[] args) {
		
		Song s1 = new Song("some song1","john, jennie",5.5f);
		Song s2 = new Song("some song2","fionna, sia",4.5f);
		Song s3 = new Song("some song3","john, Maggie",6.5f);
		Song s4 = new Song("some song4","john, Dua Lipa",2.5f);
		Song s5 = new Song("some song5","Rihana, jennie",3.9f);
		Song s6 = new Song("some song6","Rihana, jennie",4.9f);

		System.out.println("s1 hashCode is: "+s1);
		System.out.println("s2 hashCode is: "+s2);
		System.out.println("s3 hashCode is: "+s3);
		System.out.println("s4 hashCode is: "+s4);
		System.out.println("s5 hashCode is: "+s5);
		System.out.println("s6 hashCode is: "+s6);
		
//		s1.showSong();
//		System.out.println(s2);
		
		LinkedList playList = new LinkedList();
//		System.out.println(playList);
		
		playList.add(s1);
		playList.add(s2);
		playList.add(s3);
		playList.add(s4);
		playList.add(s5);
		
//		System.out.println(playList);
		
//		System.out.println(s5.nextSong);
//		System.out.println(s5.previousSong);
		
//		playList.iterate("backward");
//		
//		System.out.println("Looking for Song at Index 1");
//		Song song = playList.get(6);
//		if(song != null) {
//			song.showSong();
//		}else {
//			System.out.println("No Song Found :( ");
//		}
		

//		
//		playList.remove(2);
//		playList.remove(0);
//	    playList.remove(2);
		playList.insertAtIndex(s6, 5);
		playList.bubbleSort();
//       playList.updateIndexes();
//		playList.iterate("forward");
		
	/*	System.out.println("*****STACK****");
		System.out.println("---------------");
		
		Stack stack = new Stack();
		System.out.println(stack);
		
		stack.push(s1);
		stack.push(s2);
		stack.push(s3);
		stack.push(s4);
		stack.push(s5);
		
		stack.pop();
		stack.iterate();
		
		System.out.println("QUEUE");
		System.out.println("```````");
		
		Queue queue = new Queue();
		
		queue.add(s1);
		queue.add(s2);
		queue.add(s3);
		queue.add(s4);
		queue.add(s5);
		
		queue.poll(); //remove first
		queue.poll();
		
		queue.iterate(); */
		
//	playList.insertAtIndex(s6, 4);
	
//		playList.iterate("forward");
	
	

//		playList.iterate("forward");
		
	}

}

/*
   LinkedList             Parent
   Stack and Queue        Children
   
 */
