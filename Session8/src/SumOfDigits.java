import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("N: ");
		int N = sc.nextInt();
		int sum=0;
		int digit, num;
        for(int i=1; i<=N; i++) {
          System.out.print("Enter number:");
        	num =sc.nextInt();
        	while(num>0)
        	{	
        	digit = num%10;
        	 sum+=digit;
        	 num = num/10; 
        	}
        	System.out.println("Sum Of Digits is: "+sum);
        	 sum =0;
        }
        
        sc.close();
        
	}
}


