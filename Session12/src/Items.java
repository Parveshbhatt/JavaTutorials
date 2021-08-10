
public class Items {

	String name;
	int price;
	String deliveredIn;
	String category;
	
	Items nextItem;
	Items previousItem;
	
	
	Items(){
		price = 0;
		deliveredIn = "1day";
		category= "NA";
		
	}

	Items(String name, int price, String deliveredIn, String category) {
		this.name = name;
		this.price = price;
		this.deliveredIn = deliveredIn;
		this.category = category;
	}

	
	void showItems() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(name+"\t"+price+"\t"+deliveredIn+"\t"+category);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", price=" + price + ", deliveredIn=" + deliveredIn + ", category=" + category
				+ "]";
	}
	
	
}
