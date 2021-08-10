//Main class
public class App {

	//Main Method 
	public static void main(String[] args) {
		
		LinkedList playList = new LinkedList();
		
		Song song1 = new Song("1. Permission to Dance", "BTS", 3.7f);
		
		Song song2 = new Song("2. Bimariyan", "Preetinder", 3.19f);

		Song song3 = new Song("3. Sach Keh Raha Hai", "B Praak", 3.44f);
		
		System.out.println("INITIALLY PLAY LIST DETAILS");
		System.out.println("Is playList Empty: "+playList.isEmpty());
		System.out.println("Length of playList: "+playList.length());
		
		playList.add(song1);
		
		System.out.println();
		
		System.out.println("Is playList Empty: "+playList.isEmpty());
		System.out.println("Length of playList: "+playList.length());
		
		playList.add(song2); 
		
		System.out.println("Is playList Empty: "+playList.isEmpty());
		System.out.println("Length of playList: "+playList.length());
		
		playList.add(song3);
		
		Song song4 = new Song("4. Baarish", "Kim", 4.0f);
		Song song5 = new Song("5. Some Song", "Sia", 4.57f);
		
		
		System.out.println("Is playList Empty: "+playList.isEmpty());
		System.out.println("Length of playList: "+playList.length()); 
		
		playList.iterate(true);
		System.out.println("~~~~~~~~~~~~~~~~");
		playList.iterate(false);
		
	}

}
