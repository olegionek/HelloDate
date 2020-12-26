import java.util.*;

public class example {
/**
 * @author HOME
 * @param args
 * 
 */

	 private static String stringMachine (String a,String b) {

		   System.out.println(a!=b);
		   System.out.println(a==b);
		   System.out.println();
		   String n2 = new String(b);
		   String n1 = new String(a);
		   System.out.println(n1.equals(n2));
		   System.out.println();
		   return null;
	   }
	
	
	public static void main(String[] args) {
		System.out.println(stringMachine("Oleg","Nekrasov"));
		
	}
	

}
