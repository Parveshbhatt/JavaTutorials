
public class Palindrome {

	public static void main(String[] args) {

 String  s ="nitin";
 String rev=""; 
int len =s.length()-1; 
System.out.println("len: "+len);
 for(int i=len;i>=0;i--){
     rev = rev + s.charAt(i);
  }
    System.out.println(rev);

 if(s.equals(rev)) {
     System.out.print("yes");
 }else{
    System.out.print("No");
 }

}
}


