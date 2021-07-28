
public class Recursion {

	//Recursion : it is execution of the same method from itself repeatdly
	//Relacement of loops :) -> For Complex Problems :) [problems w.r.t Tree Data Structures]
	

	static void printNumbers(int n) {
		System.out.println(n);
		n--;
		
		if(n>0) {
			printNumbers(n);
		}
	}
	
	
	public static void main(String[] args) {
			System.out.println("[MAIN]- START");
			
			int numbers = 3;
			
			printNumbers(numbers);
			
			System.out.println("[MAIN]- END");
 
			
	}

}

