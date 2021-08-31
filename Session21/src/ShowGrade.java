import java.util.Scanner;

public class ShowGrade {
	static String grade(int m) {

		if(91<=m && m<=100) {
			return "AA";
		}else if(81<=m && m<=90) {
			return "AB";
		}else if(71<=m && m<=80) {
			return "BB";
		}else if(61<=m && m<=70) {
			return "BC";
		}else if(51<=m && m<=60) {
			return "CD";
		}else if(41<=m && m<=50) {
			return "DD";
		}else if(m<=40) {
			return "Fail";
		}else {
			return "Enter valid marks!!! (out of 100)";
		}
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks(out of 100): ");
		 int mrk = sc.nextInt();
		 
		 System.out.println(grade(mrk));
		 
		 sc.close();
	}
}
