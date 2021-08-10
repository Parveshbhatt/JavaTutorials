
public class LinkedList {

	Song head;
	Song tail;
	
	private int length;
	
	boolean isEmpty() {
		return head == null;
	}
	
	int length() {
		return length;
	}
	
	void add(Song song) {
		
		length++;
		
		if(head == null) {
			
			head = song;
			tail = song;
			System.out.println("SONG ADDED AS HEAD AND TAIL");
			
		}else {
			
			tail.nextSong = song;
			song.previousSong = tail;
			
			head.previousSong = song;
			
			tail = song;
			tail.nextSong = head;
			
			System.out.println("SONG ADDED AT TAIL");
		}	
	}
	
	void iterate(String decision) {
		
		Song temporarySong = head;
		if(decision.equals("forward")) {
			
			while(true) {
			temporarySong.showSong();
			temporarySong = temporarySong.nextSong;
			
			if(temporarySong == tail) {
				temporarySong.showSong();
				break;
			 }
			}
		}else {
			temporarySong = tail;
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
	
	// Linear Search Algorithm
	
	Song get(int index) {
		
		Song songAtIndex = null;
		
		Song temporarySong = head;  //Reference Copy
		
		while(true) {
			
			if(temporarySong.index == index) {
				
				songAtIndex = temporarySong;
				break;
			}
			
			temporarySong = temporarySong.nextSong;
			
			if(temporarySong == tail) {
				if(temporarySong.index == index) {
					songAtIndex = temporarySong;
				}
				break;
			}
		}
		return songAtIndex;
	}
	

	void remove(int index) {
		
		if (index==head.index) {
			Song toBeRemoved = head;
			head = toBeRemoved.nextSong;
			tail.nextSong = head;
			head.previousSong = tail;
		}else if (index ==tail.index) {
			Song toBeRemoved = tail;
			tail = toBeRemoved.previousSong;
			head.previousSong = tail;
			tail.nextSong = head;
		}else {
		
		Song toBeRemoved = get(index);
		
		toBeRemoved.previousSong.nextSong = toBeRemoved.nextSong;
		toBeRemoved.nextSong.previousSong = toBeRemoved.previousSong;
	
		
		}
		
		updateIndexes();
	}
	
	// Assignment: Implementation, you take any input and implement it any way
	
	void updateIndexes() {
		
		int index = 0;
		Song newIndexSong = head;
		while(true) {
			newIndexSong.index=index;
			index++;
			newIndexSong = newIndexSong.nextSong;
			
			if(newIndexSong == tail) {
				newIndexSong.index=index;
				break;
			}
		}
		
	
		
	}
	
	void insertAtIndex(Song song, int index) {
		
		length++;
		Song toBeMove = get(index);
		
		if (index == head.index) {
			head = song;
			head.nextSong = toBeMove ;
			head.previousSong = toBeMove.previousSong;
			toBeMove.previousSong = head;
			tail.nextSong = head;
			
		}else if (index == tail.index+1) {
			
			tail.nextSong = song;
			song.previousSong = tail;
			
			head.previousSong = song;
			
			tail = song;
			tail.nextSong = head;
			
		}else {
		toBeMove.previousSong.nextSong = song;
		song.previousSong= toBeMove.previousSong;
		song.nextSong = toBeMove;
		toBeMove.previousSong = song;
		
		}
//		Song temporarySong = toBeMove;
//		while(true) {
//			
//			temporarySong.index++;
//			temporarySong  = temporarySong.nextSong;
//			
//			if(temporarySong == tail) {
//				temporarySong.index++;
//				break;
//			}
//		}
		
		updateIndexes();
	}
	
	
	//Based on Duration of Song
	void bubbleSort() {
		Song song1;
		Song song2;
		for(int idx=0; idx <= tail.index;idx++) {
			for(int index=0; index<=tail.index-idx;index++) {
				int tempSong;
//				Song temp;
				song1 = get(index);
				song2 = get(index+1);				
				if( song1.duration > song2.duration ) {
				
					tempSong = song1.index;
					song1.index = song2.index;
					song2.index = tempSong;
//					if (song1 == head) {
//						head = song2;
//						 temp = song1;
//						 song1 = song2; 
//						 song2 = temp;
//						
//						
//					}else if ( song2 == tail) {
//						tail = song1;
//						temp = song1;
//						 song1 = song2;
//						 song2 = temp;
//					}else {
//						temp = song1;
//						 song1 = song2;
//						 song2 = temp;
//					}
				}
			}
			
		}
		System.out.println(head+" "+tail);
//		updateIndexes();
////		
		for(int i=0; i<=5; i++) {
			Song song=get(i);
			song.showSong();
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "LinkedList [head=" + head + ", tail=" + tail + ", length=" + length + "]";
	}
	
	
}
