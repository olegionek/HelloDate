
public class equivalence {
/**
 * @author HOME
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1==n2);
/** Результат не равен, т.к. оператор == сравнивает ссылки а не count*/
		System.out.println(n1 != n2);
		System.out.println(n1.equals(n2));
	  }

}
