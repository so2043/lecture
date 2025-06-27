package _31_io.sec02_fileinputoutputstream.EX04_FileOutputStream_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
        File outFile = new File("src/sec02_fileinputoutputstream/EX04_FileOutputStream/FileOutputStream.txt");
        OutputStream os1 = new FileOutputStream(outFile);
        os1.write('J');
        os1.write('A');
        os1.write('V');
        os1.write('A');
        os1.write('\r');
        os1.write('\n');
        os1.flush();
        os1.close();
        
        OutputStream os2 = new FileOutputStream(outFile, true);
        byte[] byteArray1 = "Hello!".getBytes();
        os2.write(byteArray1);
        os2.write('\n');
        os2.flush();
        os2.close();
        
        OutputStream os3 = new FileOutputStream(outFile, true);
        byte[] byteArray11 = "Hello!".getBytes();
    }
        

}
