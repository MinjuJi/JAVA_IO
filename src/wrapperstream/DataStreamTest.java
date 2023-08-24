package wrapperstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {

		try {
			// 파일 스트림을 만들고 여기에 DataInputStream과 DataOutputStream 기능을 추가
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));

			// 각 자료형에 맞게 자료를 씀
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");

			dos.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
			
			// 파일에 쓴 순서와 같은 순서, 같은 메소드로 읽어야 함
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());

			dis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
