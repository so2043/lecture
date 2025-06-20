package _02_operation;

import java.util.Scanner;

public class OpTest12 {
	public static void main(String[] args) {
		
		// 테스트
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		System.out.println((a % 2 == 0) ? a + "는 짝수입니다." :  a + "는 홀수입니다.");
		System.out.println((Math.abs(a) % 2 == 0) ? a + "는 짝수입니다." :  a + "는 홀수입니다.");
		
		// 나머지 연산 사용 할 때 부호 주의 => 음수값을 나머지 연산 적용시 반드시 절대값을 먼저 취해야 함.
		
		
		
		
	}
}
