package _05_stringclass.sec02_string.EX05_MethodsOfString;

public class MethodsOfString_1 {
	public static void main(String[] args) {
		
		// 1번
		// 문자열 길이
		// length()
		System.out.println("1번");
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println();
		
		
		// 2번
		// 문자열 검색
		// charAt()
		System.out.println("2번");
		System.out.println(str1.charAt(1)); // e
		System.out.println(str2.charAt(3)); // 세
		System.out.println();
		
		
		// 3번
		// indexOf()
		// lastIndexOf()
		System.out.println("3번");
		System.out.println(str1.indexOf('a')); 			// 7
		System.out.println(str1.lastIndexOf('a')); 		// 9
		System.out.println(str1.indexOf('a', 8)); 		// index 8번 부터 검사 시작 // 9
		System.out.println(str1.lastIndexOf('a', 8)); 	// substring(0, 9) 에서 a 찾기 // 7
		System.out.println(str1.indexOf("Java")); 		// 6
		System.out.println(str1.lastIndexOf("Java"));	// 뒤에서 부터 찾아도 시작 위치 인덱스 반환 // 6
		
		System.out.println(str2.indexOf("하세요"));		// 2
		System.out.println(str2.lastIndexOf("하세요")); // 2
		System.out.println(str1.indexOf("bye")); 		// 해당 문자열 없으면 -1 반환	// -1
		System.out.println();
		
		
		// 4번
		// 문자열 변환 및 연결
		// String.valueOf(기본 자료형)
		// 기본자료형 -> 문자열 변환
		
		System.out.println();
		
		
		
	}

}
