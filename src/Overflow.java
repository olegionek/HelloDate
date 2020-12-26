
public class Overflow {
	
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("Большое "+ big);
		int bigger = big *4;
		System.out.println("Еще больше = " + bigger);
	}

}
