

public class Pattern {
	public int factorial (int i) {
		if (i==0) {
			return 1;
		}
		
		return i*factorial(i-1);
	}

	public static void main(String[] args) {
	
		Pattern f = new Pattern();
		
		int n =6;
		for(int i=0; i<=n; i++ ) {
			for(int j=0; j<=n-i; j++) {
				System.out.print(" ");
				
			}
			
			for (int j= 0; j<=i; j++) {
				
				System.out.print(" "+ f.factorial(i)/ (f.factorial(i-j)* f.factorial(j)) );
			}
			
			System.out.println();
			
		}
		
	}

}
