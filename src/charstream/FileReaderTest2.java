package charstream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("character.txt");

			char[] b = new char[5];
			int i;
			while ((i = fr.read(b)) != -1) {
				for (int j = 0; j < i; j++)
					System.out.print((char) b[j]);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
