import java.util.Scanner;
public class DistanceBtwPoints {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter x1 point: ");
	        int x1 = in.nextInt();
	        System.out.print("Enter y1 point: ");
	        int y1 = in.nextInt();
	        System.out.print("Enter x2 point: ");
	        int x2 = in.nextInt();
	        System.out.print("Enter y2 point: ");
	        int y2 = in.nextInt();
	        double Dis;
	        
	        Dis = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
	        
	        System.out.print("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>");
	        System.out.printf("%.3f",Dis);

	    }
	    
}
	

