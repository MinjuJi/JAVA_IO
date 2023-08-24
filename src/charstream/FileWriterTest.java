package charstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("writer.txt");
			fw.write('A');

			char[] arr = { 'B', 'C', 'D', 'E' };
			fw.write(arr);

			fw.write("안녕하세요");
			fw.write(arr, 1, 3);
			fw.write("65");
			fw.write(65);

			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력 완료!");
	}

}
