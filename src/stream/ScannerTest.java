package stream;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("이름: ");
		String name = kb.next();
		System.out.println("직업: ");
		kb.nextLine();
		String jop = kb.nextLine();

		System.out.println("사번: ");
		int num = kb.nextInt();

		kb.close();

		System.out.println("====입력 결과====");
		System.out.println(name);
		System.out.println(jop);
		System.out.println(num);

	}

}
