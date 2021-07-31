
public class CharArray {

	public static void main(String[] args) {
		
		String quote = "be exceptional";
		
		char[]  array = quote.toCharArray();
		
		System.out.println("array is: "+array);
		
		int length= array.length;
		System.out.println(length);
		for (char ch : array) {
			System.out.print(ch+" ");
		}
		System.out.println();
		for(int i=0; i<array.length;i++) {
			if(i==0) {
				int iCh = (int)array[i]-32;
				
				System.out.println("iCh is: "+iCh);
				
				char ch = (char)iCh;
				
				System.out.println("ch is: "+ch);
				
				array[i]= ch;
			}
		}
		
		String newQuote = new String(array);
		
		System.out.println(newQuote);
		

	}

}
