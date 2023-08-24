package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("output2.txt", true);

			byte[] arr = new byte[26];
			byte data = 65; // A의 아스키 값

			// A~Z 아스키 값을 배열에 넣기
			for (int i = 0; i < arr.length; i++) {
				arr[i] = data;
				data++;
			}
			fos.write(arr); // 배열은 한꺼번에 출력

			fos.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
