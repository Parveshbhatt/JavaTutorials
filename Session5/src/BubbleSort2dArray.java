
public class BubbleSort2dArray {

	public static void main(String[] args) {
		//Bubble Sort for 2D array
		
		int[][] data= {
				{7, 90, 5, 0, 1, 9, 12, 8, 90, 34, 55, 0},
				{3, 45, 5, 6, 1, 9, 12, 8, 90, 34, 55, 0},
				{9, 4, 57, 6, 10, 9, 12, 8, 90, 34, 55, 0},
				{2, 48, 5, 6, 1, 9, 112, 9, 90, 34, 55, 0},
				{0, 4, 50, 6, 1, 9, 12, 8, 90, 34, 55, 0}
		};
		
		for(int i=0; i<data.length; i++) {
			for (int j=0; j<data.length-i-1; j++) {
				if (data[j][0]>data[j+1][0]) {
					int temp= data[j][0];
					data[j][0]=data[j+1][0];
					data[j+1][0]=temp;
				}
			}
		}
		
		System.out.println("Your sorted 2D array is: ");
		
		System.out.println("C D");
		for(int[] array: data) {
			for(int element: array) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
