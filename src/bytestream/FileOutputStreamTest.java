package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("output.txt", true);
			fos.write(69);
			fos.write(70);
			fos.write(71);

			fos.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
