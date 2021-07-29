
public class StringAPI {

	public static void main(String[] args) {
		
		int i = 10;
		
		//Interned Strings
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		//String Objects 
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		//to convert object string to intern string use .intern() method
		//String s5 = new String("Hello").intern();
		
		System.out.println("i is: "+i);
		
		
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("s2 is: "+s3);
		System.out.println("s2 is: "+s4);
		
		// toString will be executed automatically if we do not execute it ourselves
		
		System.out.println();
		
		System.out.println("s1.toString() is: "+s1.toString());
		System.out.println("s2.toString() is: "+s2.toString());
		System.out.println("s3.toString() is: "+s3.toString());
		System.out.println("s4.toString() is: "+s4.toString());
	
		if(s1==s2) {
			System.out.println("s1 == s2 ");
			
		}else {
			System.out.println("s1 != s2");
		}
		
		if (s3==s4) {
			System.out.println("s3==s4");
		}else {
			System.out.println("s3 != s4");
		}
		
		if(s1==s3) {
			System.out.println("s1==s3");
		}else {
			System.out.println("s1 != s3 ");
		}
		
		// to Compare content(data) in strings
		
		//.equals()
		
		if (s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}else {
			System.out.println("s1 not equals s2 ");
		}
		
		
		//.contentEquals()
		
		if (s1.contentEquals(s2)) {
			System.out.println("s1 contentEquals s2");
		}else {
			System.out.println("s1 not contentEquals s2 ");
		}
		
		
		
	 /*
	  *  Q)  what is difference between .equals() and .contentEquals() ?
	  *  => .equals only compare String object. All other object type are 
	  *     considered as not equals
	  *    
	  *  =>  .contentEquals can compare the contents of a String, a StringBuilder, 
	  *  	  ,a StringBuffer, a CharSequence and all derived classes of these.
	  *    
	  */
		StringBuilder s6 = new StringBuilder("Hello");
		
		if(s1.equals(s6)) {
			System.out.println("s1 equals s6");
		}else {
			System.out.println("s1 not equals s6");
		}
		
		if(s1.contentEquals(s6)) {
			System.out.println("s1 equals s6");
		}else {
			System.out.println("s1 not equals s6");
		}
		
		//.compareTo() -> works with ASCII code
		
//		if (s1.compareTo(s2) == 0) {
		if (s1.compareToIgnoreCase(s2) == 0) {
			System.out.println("s1 compareTo s2");
		}else {
			System.out.println("s1 not compareTo s2");
		}
		
	}

}
