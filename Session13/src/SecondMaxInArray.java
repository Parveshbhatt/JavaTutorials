import java.util.Scanner;

public class SecondMaxInArray {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<array.length; i++) {
			 array[i] = sc.nextInt();	
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
       System.out.println("The 2nd largest digit is: "+array[array.length-2]);
		
	}

}
