import java.util.Scanner;


public class digitToString {

	public static void main(String[] args) {
		int digit;
		int remainingnumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		
		
		
		while(n>0) {
			digit = n%10;
			remainingnumber = (n-digit)/10;
			n = remainingnumber;
		}

	}

}
