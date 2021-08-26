import java.util.Scanner;

interface Notification{
	
	void notify10PercentRemains(String message);
	void paidFullAmount();
}

interface Transactions{
	void pay();
}

class Customer implements Notification{
	String name;
	String email;
	
	Customer(){
		
		name = "john";
		email= "john@example.com";
		
	}
	
	Customer(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	@Override
	public void notify10PercentRemains(String message) {
		System.out.println("````````````````````````");
		System.out.println("A new message arrive \nHello, "+name);
		System.out.println(message);
		System.out.println("````````````````````````");
	}

	@Override
	public void paidFullAmount() {
		System.out.println("Congratulations,"+name+" you have paid full amount");
		
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	
}

class Company  implements Transactions{
	Scanner sc = new Scanner(System.in);
	float amount = 0.0f;
	float price;
	float percent10OfPrice;
	float transactions;
	
	Notification notification = new Customer();   
	static int i=1;
	
	void Service(float price) {
		this.price = price;
		percent10OfPrice = 0.1f *price;
		
	}
	
	public void pay() {
	
		System.out.println("Enter Amount for Trasactions: ");
		while(true) {
			transactions = sc.nextFloat();
			 amount += transactions;
			if ((price - amount) == percent10OfPrice) {
				
				notification.notify10PercentRemains("10% of service amount remaining");
			}
			
			if (amount >= price) {
				 notification.paidFullAmount();
				 if(amount > price) {
					 float extraPaid = amount - price;
					 System.out.println("Extra Amount Paid: "+extraPaid+"\nwe'll definitely refund extra amount :) ");
				 }
				 break;
			}
			i++;

		}
		
	}
}	


public class ServiceFeeThankYouReminder {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Service price: ");
		float price = sc.nextFloat();
		Company company = new Company();
		company.Service(price);
		company.pay();

		sc.close();
	}

}



