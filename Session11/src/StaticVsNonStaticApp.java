
class Dish{
	
	//static -> property of class
	
	static int numOfDishes;
	static int totalDishes;
	
	
	//non static -> property of object
	 String name;
	int quantity;
	int price;
	
	Dish(){
		
		name="NA";
		quantity = 1;
		price = 100;
		totalDishes += quantity;
		numOfDishes++;
		
	}
	
	Dish(String name, int quantity, int price){
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		totalDishes += quantity;
		numOfDishes++;
		
	}

	void showDish() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(name+"\t"+quantity+"\t"+price+"\t");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	
	}
	
	void increment() {
		
		quantity++;
		totalDishes++;	
	}
	
	void decrement() {
		quantity--;
		totalDishes--;
	}
	
	// This is property of class
	
	static void showDishData() {
		System.out.println("numOfDishes: "+numOfDishes);
		System.out.println("totalDishes: "+totalDishes);
		//System.out.println(name);  -> error
	}
	
}



public class StaticVsNonStaticApp {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish("Dal Makhani", 1, 100);
		Dish dish2 = new Dish("Paneer Makhani",1, 100);
		Dish dish3 = dish1;
		
		dish1.increment();
		dish2.increment();
		dish3.increment();
		
		dish1.increment();
		dish3.decrement();
		dish2.increment();
		
		dish1.increment();
		
		dish1.showDish();
		dish2.showDish();
		
		dish3.showDish();
		
		Dish.showDishData();

	}

}
