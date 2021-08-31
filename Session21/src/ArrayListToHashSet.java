import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListToHashSet {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Fionna");
		list.add("John");
		list.add("Fionna");
		list.add("Kim");
		list.add("Jack");
		list.add("Jennie");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("convert ArrayList into HashSet :)");
		
		System.out.println("1.Using constructor");
		Set<String> set = new HashSet<String>(list);
		Set<String> set1 = new HashSet<String>();
		
		set.forEach((name)->{
			System.out.println(name);
			});
		
		System.out.println("2. Using addAll()");
		set1.addAll(list);
		for(String name: set1) {
			System.out.println(name);
		}
		
		
		System.out.println("3. Using Streams");
		
		HashSet<String> set2 = (HashSet<String>)list.stream().collect(Collectors.toSet()); 
		
		Iterator<String> itr1 = set2.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	
	}
}
