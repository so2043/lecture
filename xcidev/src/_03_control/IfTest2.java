package _03_control;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		
		// TEST
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num >= 90) {
			System.out.println("A");
		} else if(num >= 80) {
			System.out.println("B");
		} else if(num >= 70) {
			System.out.println("C");
		} else if(num >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	
		sc.close();
		System.out.println("종료");

	}
}
