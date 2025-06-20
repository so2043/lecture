package _02_operation;

import java.util.Scanner;

public class OpTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 산술연산자
		
		int a, b;
		System.out.print("a : ");
		a = sc.nextInt();
		System.out.print("b : ");
		b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a + b));	// (a+b) 대신 a+b 하면 105 된다 문자열로 인식
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		
		System.out.println(a + "/" + b + "=" + (a / b));	// 정수와 정수의 연산 결과는 정수
		System.out.println(a + "/" + b + "=" + (a / (double)b)); // 연산전에 형변환 하면 결과는 double로 나옴
		System.out.println(a + "/" + b + "=" + (double)(a / b)); // 연산후에 형변환 하면 결과가 이미 정수라 1.0
		
		System.out.println(a + "%" + b + "=" + (a % b));
		
		sc.close();
		System.out.println("종료");
		
		
	}
}
