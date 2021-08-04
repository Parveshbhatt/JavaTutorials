
class Transaction {
	  
	 int month;
	 int amount;
	 int interest;
	 int totalAmount;
	 int dues;
	 
	 Transaction(){
		 
		 
	 }
	 
	 Transaction(int month, int amount, int interest){
		 
		 this.month = month;
		 this.amount = amount;
		 this.interest = interest;
		 totalAmount = amount+interest;
		 dues = totalAmount;
		 
	 }
	 
	 @Override
	 
	 public String toString() {
		 return "Trasaction [month=" +month+ ", amount= "+amount+ ", interest="+interest+", totalAmount="+totalAmount+", dues="+dues+"]";
		 
	 }
	 
}

public class ArraysOfObjects {

	public static void main(String[] args) {

//		Transaction t1 = new Transaction(1, 10000, 1000);
//		Transaction t2 = new Transaction();
//		Transaction t3 = new Transaction();
//		Transaction t4 = new Transaction();
//		Transaction t5 = new Transaction();
		//Transaction t6 = t3; // Reference Copy :)
		
		int a1 = 10;
		int a2 = 20;
		int a3 = 30;
		int a4 = 40;
		int a5 = 50;
		
		// Array of Integers
		int[] array = new int[]{a1, a2, a3, a4, a5};
		
		
		// Array of Objects  :)
		
		//Transaction[] transactionArray = new Transaction[] {t1, t2, t3, t4, t5};
		
		Transaction[] transactionArray = new Transaction[5];
		transactionArray[0] = new Transaction(1, 10000, 1000);
		transactionArray[1] = new Transaction();
		transactionArray[2] = new Transaction();
		transactionArray[3] = new Transaction();
		transactionArray[4] = new Transaction();
		
		for(Transaction transaction : transactionArray) {
			System.out.println(transaction);
		}

	}

}
