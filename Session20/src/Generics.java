// Generics in java
// templates in c++

class User{
	String name;
	String email;
	User next;
	User previous;
}

class Song{

	String name;
	String duration;
	Song next;
	Song previous;
}

class LinkedList<T>{
	T head;
	T tail;
}

class Maths<T>{
	
	// Attributes become dynamic
	T num1; // are now reference variables :)
	T num2;
	
	 Maths() {
		num1 = null;
		num2 = null;
	}
	 
	 Maths(T num1, T num2){
		 this.num1 = num1;
		 this.num2 = num2;
		}
	
	 void show() {
		 System.out.println("num1 is: "+num1);
		 System.out.println("num2 is: "+num2);
	 }
	/*T add() {
		return num1+num2;
	}
	
	T sub() {
		return num1-num2;
	} */
}


public class Generics {
		public static void main(String[] args) {
		
			Maths<Integer> m1 = new Maths<Integer>(10, 20);
//			System.out.println(m1.add());
//			System.out.println(m1.sub());
			
			m1.show();
			
			Maths<Double> m2 = new Maths<Double>(10.2, 20.5);
			m2.show();
			
			Maths<String> m3 = new Maths<String>("PointA", "PointB");
			m3.show();
			
			
			User user1 = new User();
			User user2 = new User();
			Maths<User> m4 = new Maths<User>(user1, user2);
			
//			Maths<int> m5 = new Maths<int>(10, 20);    error :)
			
//			Assignment : Explore wildcard ? in Generics :)
			
			LinkedList<Integer> list1 = new LinkedList<Integer>();
			LinkedList<User> list2 = new LinkedList<User>();
			LinkedList<Song> list3 = new LinkedList<Song>();
			
	}
}


