import java.util.Scanner;
public class AnotherBrickInTheWall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Bricks");
		int noOfBrick = sc.nextInt();
	
		
		int john=0, jack=0;
		int total = 0;
		int jackCount=0, jacktotal=0;
		int johnCount =0, johntotal=0;
		int lastbrick=0;
		String lastPlanted="";
		
		for(int i=1; i<=noOfBrick; i++) {
			
			john = i;
			johnCount++;
			total += john;
			johntotal = total;
			
			if (total >= noOfBrick) {
				lastbrick = noOfBrick - jacktotal;
				lastPlanted = "john";
				break;
				
			}
			jack =  john*2;
			jackCount++;
			total += jack;
			jacktotal = total;
			
			if (total >= noOfBrick) {
				lastbrick = noOfBrick - johntotal;
				lastPlanted = "jack";
				break;
				
			}
		}	
		System.out.println("Total turns of john: "+johnCount+"\nTotal turns of jack: "+jackCount);
		System.out.println("No. of bricks planted in the end: "+lastbrick);
		System.out.println("Who planted lastly?: "+lastPlanted);
		
		sc.close();
	}	
}
