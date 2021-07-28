
public class FibonacciRecursion {
//	static int n1=0,n2=1,n3;
	static int fibonacci(int n) {
		
		if (n<=1) {
			return n;
		
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
	}
	
	public static void main(String[] args) {
		int n=10;
//		for(int i=1;i<9;i++) {
//			n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
		
		
		System.out.println("first "+n+" number of fibonacci series is: ");
		
		for (int i=0; i<n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		
	}

}
