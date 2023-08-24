package bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInpuStreamTest2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("input.txt");
			
			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
			}
			fis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}
