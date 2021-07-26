
public class Operators {

	public static void main(String[] args) {

//		CONTROLLER -> logical Operations or computations or Iteration
/*
 * OPERATORS -> They form the computation part of controller
 * 
 * Arithmetic Operators
 * +, -, *, /, %
 */
		int num1=10;
		int num2=3;
		
		int result= num1%num2;
		System.out.println("Remainder is: "+result);
		
		int data=260;
		int buckets=13;
		
//		% plays an important role in Hashing
//		https://www.cs.usfca.edu/~galles/visualization/OpenHash.html
		
		int hashCode=data % buckets; // Hashing Algo -> get the remainder :)
		System.out.println("HashCode of "+ data + " is: " + hashCode);
		
/*
 * ASSIGNMENT OPERATORS
 * =, +=, -=, *=, /=, %=
 * 
 * update value in hashCode by performing computation
 * hasCode = hashCode + 2;

 */
		hashCode+=2;
		System.out.println("HashCode now is: "+ hashCode);
		
//		INCREMENT / DECREMENT OPERATORS
		
		int dishQuantity=0;
		dishQuantity++;
		++dishQuantity;
		
		System.out.println("dishQuantity is: "+dishQuantity);
		
		dishQuantity= 10;
		
//		int finalQuantity = ++dishQuantity;
		
		int finalQuantity = dishQuantity++;
		
		System.out.println("finalQuantity is: "+finalQuantity+" and dishQuantity is : "+dishQuantity);
		
		/*
		 * CONDITIONAL OPERATORS
		 * for Logic Decisions in algorithm
		 * >, <, <=, >=, ==, !=
		 */
		
		int paytmWallet=50;
		int cabFare=350;
		
		System.out.println("Can the CAB be Booked: "+ (cabFare < paytmWallet));
		
		int promoCode =101; //Flat 50% off but for amount > 500
		int cartAmount= 1200;
		
		System.out.println("Will i get Discount: "+ (cartAmount > 500));
		
		/*
		 * LOGICAL OPERATORS
		 * &&, ||, !
		 */
		
		System.out.println("Will i get Discount: "+ (promoCode == 102 && cartAmount >500));
		
//		BITWISE OPERATORS
//		&, |, ^
		
		int num3=8; 	 //1 0 0 0
		int num4=12;     //1 1 0 0
		  
		int result1=num3 & num4; //1 0 0 0 ->8
		System.out.println("result1 &: "+ result1);
		
		int result2= num3 | num4; // 1 1 0 0 -> 12
		System.out.println("result2 |: "+ result2);
		
		int result3 = num3 ^ num4; // 0 1 0 0 -> 4
		System.out.println("result3 ^: "+ result3);
		
		
//		SHIFT OPERATORS
//		>>(right shift), >>(left shift), >>>(triple shift)
		
		int num5=8;				//1 0 0 0
		
		int result4= num5 >> 2; //1 0 0 0 >> 2 -> _ _ 1 0 -> 0 0 1 0
//								  _ 1 0 0 
//								  _ _ 1 0 		
		
//		Right shift -> Divide the number by 2 as base and power as shift
//		i.e 8/2 pow 2 -> 8/4 -> 2
		
		System.out.println("result4 >> : "+ result4);
		
		int result5= num5 << 2; // 0 0 0 0  1 0 0 0 
//								   0 0 1 0  0 0 0 0 
		
//		Left shift -> Multiply the number by 2 as base and power as shift
//		i.e 8 * 2 pow 2 -> 8 * 4 -> 32
		
		System.out.println("result5 is: "+ result5);
		
		int amount=12;
		int securityKey=2;
		amount=amount>>securityKey;
		System.out.println("Transacted Amount is : "+ amount);
		
		
		amount= amount<<securityKey;
		System.out.println("Received Amount is : "+ amount);
		
		int num6= -11;
		int result6=num6 >> 2;
		System.out.println("result6 is : "+result6);
		
//		11-> 1 0 1 1
//	   -11-> 0 1 0 0     ->1's compliment
//		         + 1
//		-11->0 1 0 1     ->2's compliment
		
//		0 1 0 1 >> 2 
//		_ _ 0 1         
//		1 1 0 1   
//		0 0 1 0			->1's compliment
//		    + 1
//		0 0 1 1 		->2's compliment
		
//		0 0 1 1 -> -3
		
//		TERNARY OPERATORS
//		? :
		int youtubeMember =1; // 0 is kid, 1 free, 2 is paid
		
		String msg= (youtubeMember == 1) ? "Paid Member, welcome to Youtube" : "Free Access, you will see Ads";
		System.out.println("Message is: "+ msg);

	}

}
