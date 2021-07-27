import java.util.Scanner;
public class GreatestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x: ");
		int x=sc.nextInt();
		
		System.out.println("Enter y: ");
		int y=sc.nextInt();
		
		System.out.println("Enter z: ");
		int z=sc.nextInt();
		                
		sc.close();
//		                if(x>=y)
//		                       {
//		                       if(x>y)
//		                             {
//		                              if(x>=z)
//		                                      {
//		                                       if(x>z)
//		                                              {
//		                                               System.out.println("x is greatest No.");
//		                                        }else{
//		                                               System.out.println("x and z is equal greatest No.");
//		                                }}else{
//		                                      System.out.println("z is greatest No.");
//		                                     }
//		                                   }
//		                          
//		                           else{        
//		                              if(x>=z)
//		                                      {
//		                                      if(x>z)
//		                                             {
//		                                              System.out.println("x and y are equal greatest No.");
//		                                       }else{
//		                                             System.out.println("x, y and z are equal greatest No.");
//		                               }}else{
//		                                     System.out.println("z is greatest No.");
//		                                    }
//		                                }
//		                           }
//		       
//		                     else{                 
//		                         if(y>=z)
//		                             {
//		                              if(y>z)
//		                                     {
//		                                      System.out.println("y is greatest no.");
//		                               }else{
//		                                     System.out.println("y and z are equal greatest no.");
//		                     }}else{
//		                           System.out.println("z is greatest no.");
//		                           }
//		                   
//		                              
//
//
//	}
		
//		if (x>=y && x>=z) {
//			if(x>y && x>z) {
//			System.out.println("x is greater");
//			}
//			else{
//				System.out.println("x,y,z are equal");
//			}
//		}else if(y>=x && y>=z) {
//			if (y>x && y>z) {
//				System.out.println("y is greater");
//			}else {
//				System.out.println("x,y,z are equal");
//			}
//		}else {
//			System.out.println("z is greater");
//		}

	int temp;
	temp=x>y?x:y; 
	int largest= z>temp?z:temp;
	
	System.out.println("largest number: "+largest);
	
		
	}
}
