import java.util.*;

public class Bool1 {

	public static void main(String[] args) {
		Random rnd=new Random(); //inicialize random
		int i=rnd.nextInt(2); // random function
		int j=rnd.nextInt(2);
		System.out.println("i - " + i);
		System.out.println("j - " + j);
		System.out.println("i > j is " + (i>j));
		System.out.println("i < j is " + (i<j));
		System.out.println("(i < 10) && (j<10) is = " + ((i<10)&&(j<10)));
	}

}
