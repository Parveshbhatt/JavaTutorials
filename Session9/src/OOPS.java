import java.util.Arrays;

/*            
             Think of Objects with its attributes :)
             
             Person: name, phone, email, address  
             
             
             Restaurant: name, phone, email, address, operatigHours, ratings, reviews, pricePerPerson
             Menu: title, numOfDishes, dishes
             Dish: name, price, description, discount, category
             Order: id, date, time, user, restaurant, valet
             
             User: (Person)
             Valet: (Person), workHours, area, currentLatitude,  currentLongitude, vehicle
             
             vehicle: number, brand, registrationYear, isInsured
             
             
 */

//Restaurant: name, phone, email, address, operatingHours, ratings, reviews, pricePerPerson
//MODEL OR POJO (Plain Old Java Object)

class Restaurant{
	// Attributes
    // Attributes belong to object
	
	
	String name;
	String phone;
	String email;
	String address;
	String operatingHours;
	
	float ratings;
	String[] reviews;
	int pricePerPerson;
	
	// Costructor: Property of Object
	// Method with same name as that of class name
	// It has no inputs -> DEFAULT CONSTRUCTOR
	
	Restaurant(){
		
		name = "NA";
		phone = "NA";
		email = "NA";
		address = "NA";
		operatingHours = "10:00 to 20:00";
		ratings = 3.5f;
		
		reviews = new String[] {"Awesome"};
		pricePerPerson = 50;
		System.out.println("[DEFAULT] Object Initialized with Default Values\n");
	}
	
	//Parameterized Constructor or No Arg Constructor or Non Default Constructor
	
	Restaurant(String name, String phone, String email, String address, String operaingHours, float ratings, String[] reviews, int pricePerPerson){
		
		// LHS: this.name -> Property of object
		// RHS name -> Input to the Constructor
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.operatingHours = operaingHours;
		this.ratings = ratings;
		this.reviews = reviews;
		this.pricePerPerson= pricePerPerson;
		
		System.out.println("[PARAMETERIZED] object Initailized with Custom Values\n");
		
		
	}
	
	 // Method 
	// Property of Object
	
	void setRestaurant(String name, String phone, String email, String address, String operaingHours, float ratings, String[] reviews, int pricePerPerson) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.operatingHours = operaingHours;
		this.ratings = ratings;
		this.reviews = reviews;
		this.pricePerPerson= pricePerPerson;
		
		System.out.println("Values Updated\n");
	}
	
	void showRestaurant() {
		System.out.println(name+" is located at "+address);
		System.out.println(name+" is opeatinal from "+operatingHours);
		System.out.println("Price Per Person is: \u20b9"+pricePerPerson);
		System.out.println();
	}
	
	
	//Setter
//	void setName(String name) {
//		this.name = name;
//	}
	
	
	//Getter
//	String getName() {
//		return name;
//	}
	
	@Override
	
	public String toString() {
		return "Restaurant [name=" + name +", phone="+ phone +",email=" + email +", address="+address+", operatingHours="
				+ operatingHours +", ratings=" + ratings +", reviews="+ Arrays.toString(reviews) +", pricePerPerson="+ pricePerPerson + "]";
	}
	
}

class Menu{
	
	String title;
	int numOfDishes;
	Dish[] dishes;
	
	Menu(){
		
	}
	
	Menu(String title, int numOfDishes, Dish[] dishes) {
		this.title = title;
		this.numOfDishes = numOfDishes;
		this.dishes = dishes;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	int getNumOfDishes() {
		return numOfDishes;
	}

	void setNumOfDishes(int numOfDishes) {
		this.numOfDishes = numOfDishes;
	}

	Dish[] getDishes() {
		return dishes;
	}

	void setDishes(Dish[] dishes) {
		this.dishes = dishes;
	}
	
	
	
	
}

class Dish{
	
	String name;
	int price;
	String description;
	
	
	Dish(){
		name = "NA";
		price = 0;
		description = "NA";
	}


	Dish(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	int getPrice() {
		return price;
	}


	void setPrice(int price) {
		this.price = price;
	}


	String getDescription() {
		return description;
	}


	void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	
	
}
 		

public class OOPS {

	public static void main(String[] args) {
		
		//Object Construction Statement
		
		Restaurant restaurant1 = new Restaurant();
		Restaurant restaurant2 = new Restaurant("Burger King", "+91 99999 22222", "email@burgerking.com", 
				"Sarabha Nagar", "10:00 to 22:00", 4.7f,
				new String[]{"Very Awesome Burgers", "I found burger to be nice", "coke was fine"},
				120);
		
		Restaurant restaurant3 = restaurant1; //Reference copy
		
		// restaurant1 and restaurant2 are NOT OBJECTS
		// They are REFERENCE VARIABLES
		
		restaurant1.name = "Mc Donalds";
		restaurant1.phone = "+91 99999 11111";
		restaurant1.email = "email@mcdonalds.com";
		restaurant1.address = "Ansal Plaza";
		restaurant1.operatingHours = "10:00 to 22:00";
		restaurant1.ratings = 4.5f;
		restaurant1.reviews = new String[]{"Awesome Burgers"," I found burger to be good", "coke was out of fizz"};
		restaurant1.pricePerPerson = 100;
		
//		restaurant2.name = "Burger King";
//		restaurant2.phone = "+91 99999 22222";
//		restaurant2.email = "email@burgerking.com";
//		restaurant2.address = "Sarabha Nagar";
//		restaurant2.operatingHours = "10:00 to 22:00";
//		restaurant2.ratings = 4.7f;
//		restaurant2.reviews = new String[]{"Very Awesome Burgers", "I found burger to be nice", "coke was fine"};
//		restaurant2.pricePerPerson = 120;
		
		/*System.out.println(restaurant1.name+" is located at "+restaurant1.address);
		System.out.println(restaurant1.name+" is operational between "+restaurant1.operatingHours);
		System.out.println("Price Per Person is: \u20b9"+restaurant1.pricePerPerson);
		
		System.out.println();
		
		System.out.println(restaurant2.name+" is located at "+restaurant2.address);
		System.out.println(restaurant2.name+" is operational between "+restaurant2.operatingHours);
		System.out.println("Price Per Person is: \u20b9"+restaurant2.pricePerPerson);*/
		
		restaurant3.name = "Mc D ";
		//restaurant1.setName("Dominos");
		//restaurant1.setRestaurant(null, null, null, null, null, 0, args, 0 );
		
		
		
		restaurant1.showRestaurant();
		restaurant2.showRestaurant();
		restaurant3.showRestaurant();
		
	//	System.out.println("Name of restaurant2 is: "+restaurant2.getName());  //InDirect Access
		System.out.println("Name of restaurant2 is: "+restaurant2.name);       //Direct Access
		
		System.out.println(restaurant1);
		System.out.println(restaurant2);
		System.out.println(restaurant3);
	}

}
