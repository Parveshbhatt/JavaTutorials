
/*
 		OBJECT ORIENTED PROGRAMMING STRUCTURE
 		>object
 		>Class
 		
 		Object is more important to understand than class
 		
 		Real World:
 		- - - - - - - -
 		
 		> Anything in reality is an object
 		> Class is representation of an object
 		
 		Computer Science:
 		 - - - - - - - - - -
 		 
 		 >What is an Object?
 		  Object is a Storage container. Its a Box
 		  It can contain data, which may be homo or hetro
 		  
 		  
 		  What is Class?
 		  Class is textual representation of an object
 		  
 		  
 		  Principle of OOPS:
 		  1. Think of Object
 		  
 		  		software requirement sheet -> Business Analyst
 		  		
 		  		Client, Mr john 
 		  		
 		  		create a Food Delivery App.
 		  		
 		  		App should List the Restaurant alognwith their Menu.
 		  		Menu will have Dishes for which User can select Quantity.
 		  		Hence, User can place an Order. User can Pay by Multiple payment options
 		  		Further, Order must be accepted by the Restaurant 
 		  		
 		  		If order is accepted a Valet will deliver the order to Customer
 		  		
 		  		
 		  		Object will have lot of data associated to it
 		  		
 		  		Software Architect
 		  		
 		  		Think of Objects with its attributes :)
 		  		
 		  		Person: name, phone, email, address
 		  		
 		  		Restaurant: name, phone, email, address, operatingHours, ratings, reviews, pricePerPerson
 		  		Menu: title, numberOfDishes, dishes
 		  		Dish: name, price, description, discount, category
 		  		Order: id, date, time, user, restaurant, valet
 		  		
 		  		User:(Person)
 		  		
 		  		Valet: (Person), workHours, area, currentLatitude, currentLongitude, vehicle
 		  		
 		  		vehicle: number, brand, registrationYear, isInsured
 		  		
 		 2.  Find Relationships in Objects
 		 	
 		 	2.1 HAS-A
 		 	2.2 IS-A
 		 	
 		 	Restaurant HAS-A Menu 1 to 1
 		 	Menu HAS Dishes 1 to many
 		 	Many Restaurant will have Many Menus
 		 	
 		 	
 		 	User IS A Person
 		 	Valet IS A Person 
 		 	
 		3. Create the class which will represent the above Object :)
 		 	
 		 	Hence, lastly from the representation we will be able to create real objects in memory
 		 	
 		 
 
 */

// 1. Think of object
 	 
// 		Dish: name, price, description, discount, category


// 3. Create the Class
// This is representation of Dish Object

// Whatever we write in class is the property of object

class Dish{
	
	// Attributes
	
	//Data associated with object
	
	String name;
	int price;
	String description;
	int discount;
	String category;
	
}

// Main class :)

// A class with main method
// In the project we need to have only 1 main class

public class OOPS {

	public static void main(String[] args) {
		
		// Create the Real object in memory
		
		
		// Object Construction statement
		Dish dish1 = new Dish();
		Dish dish2 = new Dish();
		Dish dish3 = dish1;
		
		
		//In C++
		//Dish dish1;                   //Object construction at compile Time
		//Dish *dish2 = new Dish();     //Object construction at Run Time
		
		
		System.out.println("dish1 is: "+dish1);
		System.out.println("dish2 is: "+dish2);
		System.out.println("dish3 is: "+dish3);
		
		//dish1, dish2 and dish3 are NOT OBJECTS :)
		//dish1, dish2 and dish3 are REFERENCE VARIABLES which hold the HASHCODE of Objects :)
		
		//dish3 = dish1 is a reference copy operation
		
		
		//OPERATIONS ON OBJECT
		
	   // 1. Write Operation
		
		dish1.name = "Dal Makhani";
		dish3.category = "Indian veg";
		dish1.description = "Black Lentils Cooked Overnight";
		dish1.price = 300;
		dish3.discount = 20;
		
		
		dish2.name = "Noodles";
		dish2.category = "chinese";
		dish2.description = "Veggie Hakka Noodles with Schezwan Sauce";
		dish2.price = 200;
		dish2.discount = 0;
		
		
		// 2. Update Operation
		
		dish1.discount = 50;
		
		// 3. Read Operation
		
		
		System.out.println("-----------------------------------------------");
		System.out.println(dish1.name+" is available for \u20b9"+dish3.price);
		System.out.println(dish1.description);
		System.out.println("-----------------------------------------------");
		
		System.out.println(" - - - - - - - - - - -- - - - - - - - - - -- - -");
		System.out.println(dish2.name+" is available for \u20b9"+dish2.price);
		System.out.println(dish2.description);
		System.out.println("- - - - - - - - - - - - -- - - - - - -  --- - - ");
		
		
		//4. Delete Operation
		// we can't delete object or its attributes 
		// we can simply allocate it to null
		
		dish1 = null;  // -> garbage Collector will directly clean the object 
		
		dish3 = null;
		dish2 = null;
		
		System.gc();
		
	}

}
