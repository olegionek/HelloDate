import java.util.*;
/**
 * @category Coin program without choise
 * @author HOME
 *
 */
public class Bool1 {

	public static void main(String[] args) {
		Random rnd=new Random(); //inicialize random
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Бросить монетку(y,n)?");
		String input=scanner.nextLine();	
		if("y".equalsIgnoreCase(input)) {			

		while("y".equalsIgnoreCase(input)) {
    	int i=rnd.nextInt(2); // random function
		int j=rnd.nextInt(2);
		if(i>j) {
			System.out.println("Орел");
		}
		else if (i<j) {
		System.out.println("Решка");
		}
		else if (i==j) {
			System.out.println("Ребро!");
		}
		System.out.print("Продолжить(y,n)?");
		input=scanner.nextLine();
		}
	}
		else {
			System.out.println("Goodbye!");
		}
	}
	
}
