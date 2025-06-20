package _01_basic;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PrimitiveType {
	public static void main(String[] args) {
		
		
		// 자료형 8가지 외우기
		// 특징 분류해서 
		
		boolean b = true;
		System.out.println(b);
		
		byte b2 = 10; 				// byte : -128 ~ 127 //0 때메
//			 b2 = 128; 	// 에러남 (범위 밖)
		System.out.println(b2);
		
		char c = 's'; 	// 0 ~ 65535 까지 각 문자가 매핑 되어있음
		
									// int는 4byte 정수 타입
		int i = 2147483647; 		// int는 +- 20억
		System.out.println(i);
		
		short sh = 32767; 			// short는 -32768 ~ 32767
		System.out.println(sh);
		
		long lo = 2147483648L; 		// 8byte 정수 타입	// +- 900경
		System.out.println(lo);
		
		double d = 3.1415926535; 	// 8byte	// 정밀도 높음
		System.out.println(d);
		
		float f = 3.1415926535f;	// 4byte	// 정밀도 낮
		System.out.println(f);
		
		
		System.out.println(2 - 1.1);
		BigDecimal bd = new BigDecimal("2");	// "" 꼭 쓰기
		System.out.println(bd.subtract(new BigDecimal("1.1")));
				
		
		
	}

}
