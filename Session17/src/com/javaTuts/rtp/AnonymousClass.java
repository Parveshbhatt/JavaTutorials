package com.javaTuts.rtp;
class CustomerOrder{
	
	 static int nitem;
	
	CustomerOrder(){
		
	}
	
	CustomerOrder(int nitem){
		CustomerOrder.nitem = nitem;
	}
	
	  void noOfItems() {
		System.out.println("Total Number of items "+nitem);
	}
}

public class AnonymousClass {
	
	public static void main(String[] args) {

//		CustomerOrder customerOrder = new CustomerOrder(10);
		
		// Anonymous Class :)
		CustomerOrder customerOrder = new CustomerOrder(10) {
			
			@Override
			   void noOfItems() {
				
				System.out.println("Orders no. is: "+nitem);

			}
		};
		customerOrder.noOfItems();
		
		CustomerOrder customerOrder2 = new CustomerOrder(20);
		customerOrder2.noOfItems();
		
	}

}
