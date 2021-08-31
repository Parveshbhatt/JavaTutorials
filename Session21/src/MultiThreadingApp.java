import java.util.ArrayList;

//Asynchronous Programming
//Concurrent Programming

/*class Printer{
	void printDocument(String name, int numOfCopies) {
		for(int i=1;i<=numOfCopies;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  System.out.println("[PRINTER] Printing Document #"+i);
		}
	}
}*/

// Printer IS-A Thread :)
class Printer extends Thread{
	
	String documentName;
	int numOfCopies;
	
	
	
	Printer(String documentName, int numOfCopies) {
		this.documentName = documentName;
		this.numOfCopies = numOfCopies;
	}


	public void show(int a) {
		for (int i=1; i<=a; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("This is document "+i);
		}
	}

	public void run() {
		for(int i=1;i<=numOfCopies;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  System.out.println("[PRINTER] Printing Document "+documentName+" #"+i);
		}
	}

}

public class MultiThreadingApp {
	public static void main(String[] args) {
		System.out.println("[MAIN] App Started");
		
//		Printer printer = new Printer();
//		printer.printDocument("MultiThreading.pdf", 10);
		
		Printer printer = new Printer("MultiThreading.pdf", 10);
		printer.start(); // This will internally executer the run method
		printer.show(10);
		
		ArrayList<Integer> productPrices = new ArrayList<Integer>();
		productPrices.add(2000);
		productPrices.add(5000);
		productPrices.add(22000);
		productPrices.add(12000);
		productPrices.add(16000);
		productPrices.add(17000);
		
		productPrices.forEach((price)->{
			System.out.println("[MAIN] Product Price: "+price);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		
		System.out.println("[MAIN] App Finished");

	}
}
