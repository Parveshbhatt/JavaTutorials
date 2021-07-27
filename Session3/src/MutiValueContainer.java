
public class MutiValueContainer {

	public static void main(String[] args) {
		
		int confirmedCountry = 23422;
		int activeCountry = 30400;
		int recoveredCountry = 645151;
		int deceasedCountry = 3000;
		
		
		//Multi Value Container
		// 1. Array -> Homogeneous and Fixed in size
		// 2. Object -> Homogeneous or Hetrogeneous and Dynamic Size
		// 3. DataStructures known as collections in Java :) Homogeneous or Hetrogeneous and Dynamic size
		
		int countryCaseStatus[] = {23433, 30405, 64593, 3000};
		
		System.out.println("Confirmed Country is: " +confirmedCountry);  //23422
		
		System.out.println("County Case Status is: "+countryCaseStatus); //Hashcode
		
		
		// confirmedCounty -> is a Primitive 
		// countyCaseStatus is Reference Variable :)
		
		// Reference Variable will hold the HashCode of Multi Value container
		
		//FOR READING ARRAY
		
		System.out.println(countryCaseStatus[0]);
		System.out.println(countryCaseStatus[1]);
		System.out.println(countryCaseStatus[2]);
		System.out.println(countryCaseStatus[3]);
		
		System.out.println("By using enhanced for loop  ");
		for(int i:countryCaseStatus) {
			System.out.println(2*i);
		}
	}

}
