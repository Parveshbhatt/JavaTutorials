import java.util.Scanner;

public class FactorialRecursion {

	static  int findFactorial(int n) {
		
		if (n==0 || n==1) {
			return 1;
		}
		
		return n * findFactorial(n-1);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		
		int number= scanner.nextInt();
		scanner.close();
		int factorial = findFactorial(number);
		
		System.out.println("Factorial of "+number+" is: "+factorial);

	}

}
