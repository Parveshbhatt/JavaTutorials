import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashmapToArrayList {
	public static void main(String[] args) {
		
		// TreeMap the sort on the basis of key, not value
		Map<String, Integer> nameRoll = new HashMap<String, Integer>();
		nameRoll.put("Anna", 101);
		nameRoll.put("Jennie", 102);
		nameRoll.put("Dave", 104);
		nameRoll.put("Jim", 103);
		nameRoll.put("Jack", 103);
		nameRoll.put("Kim", 105);
		
		Iterator itr = nameRoll.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry keyValue = (Map.Entry)itr.next();
			System.out.println(keyValue.getKey()+" => "+ keyValue.getValue());
		}
		 
		// convert HashMap keys into ArrayList :)
		System.out.println("\nArrayList of keys");
		List<String> keylist = new ArrayList<String>(nameRoll.keySet());
		
		keylist.forEach((key)-> {System.out.println(key);});
		
		// convert HashMap values into ArrayList :)
		System.out.println("\nArrayList of values of HashMap");
		List<Integer> valueList = new ArrayList<Integer>(nameRoll.values());
		
		valueList.forEach((value)-> {System.out.println(value);});
		
		
	}
}
