import com.sun.jdi.event.ExceptionEvent;

import java.util.*;


public class Bool {

	public static class sides {
		Integer a = 1;
		Integer b = 2;
		int c;
	}
	
	
	
	public static void main(String[] args) {
		sides sides = new sides();
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		
		//generic random sides of monetka

		rnd.nextInt();
		String d;
		System.out.print("Should you go?");
		String itor = scanner.nextLine();
		String c = itor;
		while (itor.equalsIgnoreCase("y")){
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

	}

}


