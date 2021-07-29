import java.util.Scanner;
public class InBuiltStringMethods {

	public static void main(String[] args) {
		
		// String is IMMUTABLE
		// We can't modify a String
		// Modifying a String means Creating a new string in memory
		
		String quote = "Be Exceptional";
		System.out.println("Quote is: "+quote);
		
		//we can't do this in java
		//  quote.toUpperCase();
		
		String modifiedQuote = quote.toUpperCase();
		
		//quote = quote.toUpperCase(); //but, it cause memory leak
		
		System.out.println("Quote Now is: "+quote);
		System.out.println("modifiedQuote: "+modifiedQuote);
		System.out.println("modified Quote 2: "+quote.toUpperCase());
		
		String names = "john, jennie, jim, jack, joe, kim";
		System.out.println("Length :"+names.length());
		
		//String replaceNames = names.replace('j', 'k');
		
		String replacedNames = names.replace("im", "o");
		System.out.println("replacedNames: "+replacedNames);
		
//		int idx = names.indexOf('o');
		int idx = names.lastIndexOf('o');
		System.out.println(idx);
		
//		char ch = names.charAt(0);
		char ch = names.charAt(names.length()-1);
		System.out.println("ch is: "+ch);
		
//		String str1 = names.substring(5);
		String str1 = names.substring(6,12); // 12 is not included
		System.out.println(str1);
		
		String[] strArray = names.split(",");
		System.out.println("length is: "+strArray.length);
		
		for(String name : strArray) {
			System.out.println(name.trim());
		}
		
		String email = "@.";
// 		int idx1 = email.indexOf("@");
//		int idx2 = email.indexOf(".");
		
//		String[] earray = email.split("@");
//		System.out.println(earray.length);
//		for(String element:earray) {
//			System.out.println(element);
//		}
		
		if (email.length()<2) {
			System.out.println("101: Invalid Email");
		}else {
			if(email.contains("@") && email.contains(".")) {
					System.out.println("Valid Email");
			}else {
				System.out.println("201: Invalid Email");
			}
		}
		
		String songName = "abc.mp3";
		if(songName.endsWith(".mp3")) {
			System.out.println("Play the Audio File");
		}else {
			System.out.println("Invalid File Format");
		}
		
		
		String[] contacts = {
				"john",
				"Jennie",
				"George",
				"Jack",
				"Joe",
				"Fionna",
				"Mike",
				"Leo"
		};
		
		String[] phones = {
				"+91 99999 11111",
				"+91 99999 22222",
				"+91 99999 33333",
				"+91 99999 44444",
				"+91 99999 55555",
				"+91 99999 66666",
				"+91 99999 77777",
				"+91 99999 88888"
		};
		
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Search...");
		String keyword = scanner.nextLine();
//		
//		for(String contact: contacts) {
//			//if(contact.toLowerCase().startsWith(keyword.toLowerCase())) {
//			 if(contact.toLowerCase().contains(keyword.toLowerCase())) {
//				 System.out.println(contact);
//			}
//		}
		
//		for(int i=0; i<contacts.length;i++) {
//			if (contacts[i].toLowerCase().contains(keyword.toLowerCase())) {
//				
//				System.out.println(contacts[i]+" "+phones[i]);
//			}
//		}
//		
		//Implementation on 2D Array -> contactsArray
		
		String[][] contactsArray = {
				{"John", "+91 99999 11111"},
				{"Jennie", "+91 99999 22222"},
				{"George", "+91 99999 33333"},
				{"Jack", "+91 99999 44444"},
				{"Joe", "+91 99999 55555"},
				{"Fionna", "+91 99999 66666"},
		};
		
		for(int i=0; i<contactsArray.length;i++) {
			for (int j=0; j<contactsArray[i].length; j++) {
				if(contactsArray[i][j].toLowerCase().contains(keyword.toLowerCase())) {
					System.out.println(contactsArray[i][j]+" "+contactsArray[i][j+1]);
				}
			}
		}
		
		scanner.close();
		
	}

}
