import java.util.*;



public class CoinGame {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random(); //generic random sides of coin


		System.out.print("Should you go?\n");
		String itor = scanner.nextLine();

		//Program Cycle
		while (itor.equalsIgnoreCase("y"))// equalsIgnoreCase сверяет даже с текстом
		{
			try{
				rnd.nextInt();
				System.out.println("Выберите сторону Орел (1) или Решка (2) : ");
				String input = scanner.nextLine();
				int i = Integer.parseInt(input);
				if (i == rnd.nextInt(2)+1) {
					System.out.println("You win!");
				}
				if (input == null) throw new Exception("1");//How to add exception?
				else {
					System.out.println("Fail");
				}
				System.out.println(input);
				System.out.println("Продолжить? (y,n) ");
				itor = scanner.nextLine();
			}
			catch (Exception ex){
				System.out.println(ex.getMessage());

		}
		}
		System.out.println("До свидания!");


}
}


