package _31_io.sec03_consoleinputoutput.EX03_ConsoleInputObject_3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject_3 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1);
		String str1 = new String(byteArray1, 0, count1, Charset.forName("UTF-8"));
		System.out.println(str1);
		
		
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArray2, offset, length);
		String str2 = new String(byteArray2, 0, offset + count2, Charset.defaultCharset()); 
		System.out.println(str2);
		
	}

}
