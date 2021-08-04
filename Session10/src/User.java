
/*   
       OOPS: 
         	Encapsulation
         	Inheritance
         	Abstraction
         	Polymorphism
 */

// User: uid, name, phone

public class User {
           
	//Encapsulation -> 100% Security
	private String secretKey = "hello123";
	
	
	//Attributes : They are property of Object
	// Non Public or Package level Attribute
	
	int uid;
	// Data Hiding
	// Private Attributes
	// Abstraction -> Indirect Access
	
	 private String name;
	 private String phone;
	
	// Property of Object
	
	User(){
		uid = 0;
		name = "";
		phone = "";
		System.out.println("[DEFAULT CONSTRUCTOR]: Object constructed with initial values");
	}
	
	
	// Parameterized Constructor
	
	User(int uid, String name, String phone){
		this.uid = uid;
		this.name = name;
		this.phone = phone;
		System.out.println("[PARAMETRIZED CONSTRUCTOR]: Object Constructed with Initial values");
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		if (name.isEmpty() || name.length()==1) {
			System.err.println("Invalid Name.");
		}
		this.name = name;
	}


	String getPhone() {
		return phone;
	}

	//To perform Validation
	void setPhone(String phone) {
		if(phone.isEmpty()) {
			System.err.println("Please Enter Correct Phone");
		}else {
			if(phone.length()==10) {
				Long.parseLong(phone);
				this.phone = phone;
			}else {
				System.err.println("Phone Number must be 10 digits");
			}
		}
		
	}
	
	// Property of object
	void showUser() {
		System.out.println("`````````````````````````````");
		System.out.println(uid+"| "+name+" | "+phone);
		System.out.println("`````````````````````````````");
		
		System.out.println();
	}
	
}
