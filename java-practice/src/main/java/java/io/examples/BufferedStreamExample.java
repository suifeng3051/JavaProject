package java.io.examples;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedStreamExample {
	public static void main(String[] args) throws IOException {
		readByBufferedInputStream();
	}
	
	public static void readByBufferedInputStream() throws IOException {
		File file = new File("d:/test.txt");
		byte[] byteArray = new byte[(int) file.length()];
		//可以在构造参数中传入buffer大小 
		InputStream is = new BufferedInputStream(new FileInputStream(file),2*1024);
		int size = is.read(byteArray);
		System.out.println("大小:" + size + ";内容:" + new String(byteArray));
		is.close();
	}
}
