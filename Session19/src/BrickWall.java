
import java.util.Scanner;

public class BrickWall {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Bricks:");
		int n = sc.nextInt();
		int jack =0;
		int john =0;
		int totalBrick =0;
		boolean turn = true; 
		
		for(int i=0;i<n && totalBrick<n;i++) {
			if(turn) {
				john++;
				totalBrick += john;
				turn = false;
			}else {
				jack++;
				totalBrick += john*2;
				turn = true;
			}
		}
		
		System.out.println("Total turns of john = "+ john);
		System.out.println("Total turns of jack = "+ jack);
		
//		System.out.println("Bricks left in the end = "+ (totalBrick - n));
		
		if(!turn) {
			System.out.println("Bricks left in the end = "+ (n-(totalBrick-john)));
			System.out.println("John planted last brick");
		} else {
			System.out.println("Bricks left in the end = "+(n- (totalBrick -john*2)));
			System.out.println("jack pla`nted last brick");
		}
			
		
		sc.close();
		

	}

}