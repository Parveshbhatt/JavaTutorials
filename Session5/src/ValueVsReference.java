
public class ValueVsReference {

	public static void main(String[] args) {
		 
		// Create Operation for x
		 int x= 10;
		 
		 
	   // Create Operation for y
	   // Value copy :)
		 
		 int y=x;
		 
		 
		 //Update Operation
		 
		 y += 10;
		 
		 System.out.println("x is: "+x);
		 System.out.println("y is: "+y);
		 
		 int[] a = {10, 20, 30, 40, 50};
		 System.out.println(a);
		 
		 int[] b = a;   //Reference copy :)
		 System.out.println(b);
		 
		 //update Operation
		 
		 for (int i=0; i<b.length; i++) {
			 b[i] += 5;
		 }
		 
		 System.out.print("b[]: ");
		 for (int element: b) {
			 System.out.print(element+" ");
		 }
		 System.out.println();
		 
		 System.out.print("a[]: ");

		 for (int element: a) {
			 System.err.print(element+" ");
		 }
	}

}
