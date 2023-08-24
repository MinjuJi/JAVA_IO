package bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInpuStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
		} catch (IOException e) { // FileInputStream은 읽으려는 파일이 없으면 FileNotFoundException예외가 발생
			System.out.println(e);
		} finally {
			try {
				fis.close(); // 파일이 없어 스트림이 생성되지 않을 때 닫을 것이 없어 예외 발생
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
