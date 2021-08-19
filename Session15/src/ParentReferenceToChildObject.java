class Parent{
	String  name;
	
}

class Child extends Parent{
	int salary;
}



public class ParentReferenceToChildObject {

	public static void main(String[] args) {

		Parent parent = new Child();
		parent.name= "Ram";
		//parent.salary = 100;
		System.out.println("name: "+parent.name);
		//System.out.println("Salary: "+parent.salary);
				
	}
	
	

}
