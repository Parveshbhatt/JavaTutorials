
public class BubbleSortAlgo {
	public static void main(String[] args) {
		int [] data= {11, 5, 20, 8, 17, 12,22,1,0,7};
		
		//Bubble Sort
		for (int i=0; i<data.length; i++) {  
			System.out.println("For i: "+i);
			System.out.println("j is: ");
			for(int j=0; j<data.length-i-1; j++) {
				System.out.print(j+" ");
				if(data[j]>data[j+1]) {
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}else {
					data[j]=data[j];
				}
			}
			System.out.println();
		}
		System.out.println("###############");
		for (int element: data) {
			System.out.print(element+" ");
		}
	}
}
// represent covid data in in 2D array by using Bubble sort 

//
//public class BubbleSortAlgo {
//
//	public static void main(String[] args) {
//		int[][] a= { 
//				
//				{ 50,40,30,20,10},
//				{ 60,50,40,30,20},
//				{ 50,40,30,20,10},
//				{ 60,50,40,30,20},
//				{ 50,40,30,20,10},
//				{ 60,50,40,30,20},
//				{ 6,50,40,30,20},
//				{ 0,50,40,30,20},
//				{ 67,50,40,30,20},
//				{ 34,56, 40,30,287}
//				
//				
//				
//				
//		};
//		
//
//		
//		for(int j=0;j<a.length;j++) {
//		
//		for(int i=0;i<a.length-1-j;i++) {
//			
//				
//				if(a[i][0]>a[i+1][0]) {
//					int temp;
//					temp =a[i+1][0];
//					a[i+1][0]=a[i][0];
//					a[i][0]=temp;
//				
//				}
//			
//			}
//		}
//		
//		System.out.println("Confirmed  TotalCases  NewCases  TotalRecovered  ActiveCases");
//		
//		
//		for(int[] array : a) {
//			for(int element : array) {
//				System.out.print(element+"           ");
//			}
//			System.out.println();
//		}
//
//	}
//
//}