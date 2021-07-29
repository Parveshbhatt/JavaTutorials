import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 2 Strings: ");
		String A= sc.nextLine().toLowerCase();
		String B= sc.nextLine().toLowerCase();
		
		sc.close();
		int length=A.length()+B.length();
		
		System.out.println(length);
		
		int result = A.compareTo(B);
		
		if(result>0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
//		char cptlA=A.charAt(0);
//		char cptlB=B.charAt(0);
//
//		String s1= A.substring(1);
//		String s2= B.substring(1);
//	 System.out.printf("%C%s %C%s",cptlA,s1,cptlB,s2);
	 
	 System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
	}

}
