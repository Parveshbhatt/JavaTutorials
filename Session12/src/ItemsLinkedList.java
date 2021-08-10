
public class ItemsLinkedList {

	Items head;
	Items tail;
	
	ItemsLinkedList(){
		head = null;
		tail = null;
	}
	
	int noOfItems=0;
	
	boolean isEmpty() {
		return head==null;
	}
	
	int noOfItems() {
		return noOfItems;
		
	}
	
	void add(Items item) {
		noOfItems++;
		if (head==null) {
			
			head = item;
			tail = item;
			
		}else {
			tail.nextItem = item;
			item.previousItem = tail;
			
			head.previousItem = item;
			
			tail = item;
			tail.nextItem = head;
			
		}
	}
	
	void remove(Items item){
		
		if(head == null) {
			System.out.println("can't remove from empty cart");
		}else {
			if (item == head) {
				
				head = item.nextItem;
				tail.nextItem = head;
				head.previousItem = tail;
				
			}else if(item == tail) {
				
				tail = item.previousItem;
				head.nextItem = tail;
				tail.nextItem = head;
			}else {
			item.previousItem.nextItem = item.nextItem;
			item.nextItem.previousItem = item.previousItem;
			}
		}
		
		
	}
	
	
	
	void iterate(String decision) {
		
		Items temporaryitem = head;
		
		if(decision.equals("forward")) {
			
			while(true) {
			temporaryitem.showItems();
			temporaryitem = temporaryitem.nextItem;
			
			if (temporaryitem == tail) {
				temporaryitem.showItems();
				break;
			}
			
			}
			
		}else {
			
			temporaryitem = tail;
			while(true) {
				temporaryitem.showItems();
				temporaryitem = temporaryitem.previousItem;
				
				if (temporaryitem == head) {
					temporaryitem.showItems();
					break;
				}
				
				}
			
		}
	}
	
	
}
