package _02_operation;

import java.util.Scanner;

public class OpTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 관계연산자
		
		int a, b;
		System.out.print("a : ");
		a = sc.nextInt();
		System.out.print("b : ");
		b = sc.nextInt();
		
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		
		
		
		System.out.println("종료");
		
		
	}
}
