
public class MutableStrings {

	public static void main(String[] args) {
		
		//Immutable String
		String str = new String("Hello");
		str.concat(" World");
		
		System.out.println("str is: "+str);
		
		
		//Mutable String
		// StringBuilder -> NOT THREAD SAFE
		
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		
		builder.reverse();
		
		System.out.println("builder is: "+builder);
		
		// StringBuffer -> THREAD SAFE
		
		StringBuffer buffer = new StringBuffer("Hello");
		
		buffer.append(" World");
		System.out.println("buffer is: "+buffer);

		//Built in methods in StringBuilder class
		
		StringBuilder s1 = new StringBuilder("Hello");
		
		System.out.println("s1: "+s1);
		System.out.println("s1.toString(): "+s1.toString());
		
		System.out.println(s1.reverse());
		
		System.out.println("capacity: "+s1.capacity());
		
		
		
	}

}
