// Main class :)
public class App {

	// Execution begins from main
	public static void main(String[] args) {
		// User* user1 = new User(); c++ Dynamic Object Construction
		User user1 =new User(); //Java only has dynamic object construction
		User user2 = new User();
		
		
		//user1.name = "kuch Bhi Naam";
		//user2.phone = "Kuch Bhi Phone";
		
		user1.setName("om");
		user2.setPhone("1234567891");
		user1.showUser();
		user2.showUser();

	}

}
