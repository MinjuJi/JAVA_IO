package wrapperstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		try {
			// InputStreamReader는 FileInputStream이 바이트 단위로 읽어들인 내용을 문자로 변환해 주는 역할(한글 출력 가능)
			InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"));
			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char) i);
			}
			isr.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
