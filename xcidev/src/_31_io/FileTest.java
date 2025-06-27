package _31_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileTest {
	public static void main(String[] args) throws IOException {
		
		// /dev/file/test/ 폴더 만들기
		File dir = new File("C:/dev/file/test");
		if (!dir.exists()) dir.mkdirs();
		
		
		// 4자리 난수로 파일명 파일 5개 만들기 
		
		for (int i=0; i<5; i++) {
			int ran = (int)(Math.random() * 1000);
			String num = String.format("%04d", ran);		// 90 -> 0090 으로 만들어줌
			
			String filename = "C:/dev/file/test/" + num + ".txt";
			File newFile = new File(filename);
			
			if (!newFile.exists()) newFile.createNewFile();
			System.out.println("파일 생성 : " + newFile.getName());
		}
			
		
//		/dev/file/test2/ 폴더로 모든 파일을 복사
//		   (2에서 파일 정보를 배열이나 컬렉션에 담지 말고, 
//		   디렉토리 정보를 읽어서 처리. File.listFiles())
		
		// /dev/file/test2/ 폴더 만들기
		File dir2 = new File("C:/dev/file/test2");
		if (!dir2.exists()) dir2.mkdirs();
		
		File[] fnames = dir.listFiles();
		for (File fname : fnames) {
			if (fname.isFile()) {
				 File destFile = new File(dir2, fname.getName());  // 복사될 파일 경로

		        // ❗ 대상 경로에 파일이 없을 때만 복사
		        if (!destFile.exists()) {
		            Files.copy(fname.toPath(), destFile.toPath());
		            System.out.println("복사 완료 : " + fname.getName());
		        } else {
		            System.out.println("이미 존재 : " + fname.getName());
		        }
            }
		}
	}
}
