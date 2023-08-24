package bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInpuStreamTest3 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("input2.txt");

			byte[] arr = new byte[10];
			int i;
			while ((i = fis.read(arr)) != -1) {
				for (int j = 0; j < i; j++) {
					System.out.print((char) arr[j]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
			fis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
//		try {
//			FileInputStream fis = new FileInputStream("inpu2.txt");
//
//			byte[] arr = new byte[10];
//			int num;
//
//			while ((num = fis.read(arr)) != -1) {
//				for (int i = 0; i < arr.length; i++) {
//					System.out.print((char) arr[i]);
//				}
//				System.out.println(": " + num + "바이트 읽음");
//			}
//			fis.close();
//		} catch (IOException e) {
//			System.out.println(e);
//		}
//		System.out.println("end");
//	}

}
