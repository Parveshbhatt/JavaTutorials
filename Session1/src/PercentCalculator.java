import java.util.Scanner;
public class PercentCalculator {

	public static void main(String[] args) {
		
		
		Scanner sc=  new  Scanner(System.in);
		System.out.println("Enter maximum marks: ");
		int maxMarks=sc.nextInt();
		
		System.out.println("Enter marks in following subject: ");
		System.out.print("subject1: ");
		int a=sc.nextInt();
		System.out.print("subject2: ");
		int b=sc.nextInt();
		System.out.print("subject3: ");
		int c=sc.nextInt();
		sc.close();
		int sum=0;
		sum=a+b+c;
		
		int totalMarks=maxMarks*3;
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Total obtained Marks: "+sum);
		
		float percentage = ((float)sum/(float)totalMarks)*100 ;
		System.out.print("Percentage: ");
		System.out.printf("%.2f",percentage);	

	}

}
