//Main Class
public class App {

	// main method -> execution begins from main
	public static void main(String[] args) {
		
		Song song1 = new Song("1. Sach Keh Raha hoon", "B Praak", 3.2f);
		Song song2 = new Song("2. Bimariyan", "Preetinder", 4.0f);
		Song song3 = new Song("3. Permission to dance", "BTS", 3.0f);
		
//		System.out.println(song1);
//		System.out.println(song2);
//		System.out.println(song3);
		
//		song1.showSong();
//		song2.showSong();
//		song3.showSong();
		
		
		//Hard Code :( -> Circular Doubly LinkedList;
		
		song1.nextSong = song2;
		song1.previousSong = song3;
		
		song2.nextSong = song3;
		song2.previousSong = song1;
		
		song3.nextSong = song1;
		song3.previousSong = song2;
		
		
		System.out.println("Forward Iteration...");
		
		Song song =song1; // Reference copy operation
		
		
		while(true) {
			song.showSong();
			song = song.nextSong; //Reference Copy
			
			if(song.nextSong == song1) {
				song.showSong();
				break;
			}
		}
		
		System.out.println("\nBackward Iteration...");
		
		song = song3;
		
		while(true) {
			song.showSong();
			song = song.previousSong; //Reference Copy
			
			if(song.previousSong == song3) {
				song.showSong();
				break;
			}
		}
		
	}

}
