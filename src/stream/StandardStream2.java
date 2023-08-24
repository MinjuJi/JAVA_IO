package stream;

import java.io.IOException;

public class StandardStream2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러개를 쓰고 enter를 누르세요.");

		int i; 
		try {
			// while문에서 read() 메서드를 이용해 한 바이트씩 읽어들인다.
			// Enter에 해당하는 '\n'값이 입력되기 전까지 read()를 반복하고, \n이 입력되면 읽어들인 내용을 화면에 출력한다.
			while((i = System.in.read()) != '\n') { 
				System.out.print((char) i); 
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
