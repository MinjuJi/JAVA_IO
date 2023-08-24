package charstream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest3 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("character.txt");

			char[] b = new char[5];

			fr.read(b, 3, 2);

			for (char i : b)
				System.out.println(i);

			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
