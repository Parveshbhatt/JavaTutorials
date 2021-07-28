// In Java any program is basically a class

public class ExecutionStack {
	//execution of program begins from main method
	//whatever we write in main will be executed in a sequence 
	//main is the FIRST method to execute automatically
	static int square(int num) {
		int result = num* num;
		return result ;
	}
	public static void main(String[] args) {
			System.out.println("Welcome to java");
			System.out.println("Welcome to java");
			
			int n=10;
			char ch ='\u20b9';
			
			int squareOfNumber=square(n);
			System.out.println("Square of Number: "+squareOfNumber);
			
	}

}
