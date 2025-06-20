package _05_stringclass.sec02_string.EX02_ModificationOfStringData;

import java.util.Arrays;

public class ModificationOfStringData {
	public static void main(String[] args) {
		
		
		// 문자열 수정
		String str1 = new String("안녕");
		String str2 = str1;
		
		str1 = "안녕하세요";		// 수정 되는게 아니라 새로 객체가 생김
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		// 배열 참조자료형
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1; 		// 같은 객체 바라봄 (배열에 실제 값이 수정되면 둘다 영향 받음)
		
		array1[0] = 6;
		array1[1] = 5;
		array1[2] = 4;
		
		System.out.println(Arrays.toString(array1)); 
		System.out.println(Arrays.toString(array2));
		
		
	}

}
