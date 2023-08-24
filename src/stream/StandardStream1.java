package stream;

import java.io.IOException;

public class StandardStream1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 enter를 누르세요.");

		int i; // i는 4바이트(int형)지만 System.in은 바이트 단위로 읽어 들이는 InputStream이므로 1바이트만 읽는다.
		try {
			i = System.in.read(); // 콘솔창에 알파벳을 입력하고 Enter를 누르면 입력한 값이 변수 i로 들어간다.
			
			System.out.println(i); // i는 int형이므로 알파벳을 정수로 출력(아스키 값을 출력)
			System.out.println((char) i); //정수를 char형으로 변환
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
