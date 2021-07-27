
public class Arrays {
	public static void main(String[] args) {
		
		//IMPLICIT
		//Syntax 1
		//int countyCaseStatus[] ={2345, 30409, 64151, 3000};
		
		//Syntax 2
		//int[] countryCaseStatus= {2345, 30409, 64151, 3000};  
		
		//EXPLICIT
		
		//Syntax 3
		//int[] countryCaseStatus = new int[]{2345, 30409, 64151, 3000};
		
		//Syntax 4
		int countryCaseStatus[] =new int[]{2345, 30409, 64151, 3000};
		
		//updating Array Index
		
		countryCaseStatus[2] = 794522;
		
		//new int[]
		//new is an operator
		//new allocates the memory to the Array dynamically i.e. at RUN TIME
		
		System.out.println("countryCaseStatus is: "+countryCaseStatus);
		
		
		//Syntax 5
		
		//creating an Empty Array
		
		int numbers[] = new int[5];
		//in the above array creation, all the elements will be 0 by default
		
		//UPDATE OPERATION 
		numbers[3]=99;
		
		System.out.println("numbers[0] is: "+numbers[0]);
		System.out.println("numbers[1] is: "+numbers[1]);
		System.out.println("numbers[2] is: "+numbers[2]);
		System.out.println("numbers[3] is: "+numbers[3]);
		System.out.println("numbers[4] is: "+numbers[4]);
		
		
		//syntax 6
		int numbers1[], numbers2, n3[];
		
		numbers1 = new int[5]; //numbers1 is an array reference
		numbers2 = 10; // is an int
		n3 = new int[10];
		
		//syntax 7
		int[] numbers3, numbers4, numbers5;
		numbers3 = new int[5];
		numbers4 = new int[10];
		
		int size = 10;
		numbers5 = new int[size];
		
		System.out.println(numbers5[2]);
		
		// int numbers[5]; is not possible  in array because it is compile time 
		//                  array, not supported in java
		//Garbage Collector :)
		System.gc();
		
		//Garbage collector is work upon (marks & sweap algorithm), which mark object
		//and after fixed interval of time , remove them if not in use
	}
}
