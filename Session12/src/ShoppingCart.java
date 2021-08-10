
public class ShoppingCart {

	public static void main(String[] args) {
		
		ItemsLinkedList cart = new ItemsLinkedList();
		
		Items item1 = new Items("1.Phone", 5000, "3days", "ElectronicDevices" );
		Items item2 = new Items("2.Shirt", 500, "4days", "cloths" );
		Items item3 = new Items("3.watch", 2000, "2days", "Accessories" );
		Items item4 = new Items("4.shoes", 3000, "5days", "casual" );
		
		System.out.println("Initial  shopping Cart: ");
		System.out.println("Is the cart empty: "+cart.isEmpty());
		System.out.println("No. of items in cart: "+cart.noOfItems());

		//item1.showItems();
		
		cart.add(item1);
		
		System.out.println("\nAfter adding 1 item in  shopping Cart: ");
		System.out.println("Is the cart empty: "+cart.isEmpty());
		System.out.println("No. of items in cart: "+cart.noOfItems());
		
		
		cart.add(item2);
		
		System.out.println("\nAfter adding 2 item in  shopping Cart: ");
		System.out.println("Is the cart empty: "+cart.isEmpty());
		System.out.println("No. of items in cart: "+cart.noOfItems());
		
		
		cart.add(item3);
		
		cart.add(item4);
	    
		
		cart.remove(item4);
		cart.remove(item1);
		
		
		System.out.println("*********\nshow all items in cart:");
		cart.iterate("forward");
		System.out.println("##########################\nBackward iteration");
		
		cart.iterate("backward");
	}

}
