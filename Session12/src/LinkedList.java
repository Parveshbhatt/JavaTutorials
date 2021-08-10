
public class LinkedList {

	Song head;
	Song tail;
	private int length;
	
//	LinkedList(){
//		head = null;
//		tail = null;
//	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	int length() {
		return length;
		
	}
	
	void add(Song song) {
		
		length++;
		
		if(head== null) {
			head = song;
			tail = song;
			System.out.println("SONG ADDED AS HEAD AND TAIL");
		}else {
			tail.nextSong = song;
			song.previousSong = tail;
			
			head.previousSong = song;
			
			tail = song;
		    tail.nextSong = head;
		    
		    System.out.println("SONG ADDED AS TAIL");
		}
	}
	
	void iterate(boolean forwardBackward) {
		
		 if (forwardBackward) {
			 Song temporarySong = head; //Reference copy
			 
			 while(true) {
				 temporarySong.showSong();
				 temporarySong = temporarySong.nextSong;
				 
				 if(temporarySong==tail) {
					 temporarySong.showSong();
					 break;
					 
				 }
			 }
		 }else {
			 Song temporarySong = tail;
			 
			 while(true) {
				 temporarySong.showSong();
				 temporarySong = temporarySong.previousSong;
				 
				 if(temporarySong == head) {
					 temporarySong.showSong();
					 break;
				 }
			 }
			 
		 }
	}
	
	
	
}
