import java.util.*;


public class CoinGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		
		//generic random sides of monetka

		rnd.nextInt();
		System.out.print("Should you go?");
		String itor = scanner.nextLine();

		//Program Cycle
		while (itor.equalsIgnoreCase("y"))// equalsIgnoreCase ������� ���� � �������
		{
			System.out.println("�������� ������� ���� (1) ��� ����� (2) : ");
			String input = scanner.nextLine();
			int i = Integer.parseInt(input);
			if (i == rnd.nextInt(2)) {
				System.out.println("You win!");
			} else {
				System.out.println("Fail");
			}
			System.out.println(input);
			System.out.println("����������? (y,n) ");
			itor = scanner.nextLine();
		}
		System.out.println("�� ��������!");

	}

}


