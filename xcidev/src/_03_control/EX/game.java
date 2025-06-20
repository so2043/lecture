package _03_control.EX;

import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		
		
		// 가위 바위 보 겜
		// 가위 : 1
		// 바위 : 2
		// 보 : 3
		
		// 1 < 2
		// 2 < 3
		// 3 < 1

		Scanner sc = new Scanner(System.in);
		
		System.out.print("내가 냄 : ");
		
		int com = (int)(Math.random() * 3) + 1;
		int you = sc.nextInt();
			
		
		System.out.print("컴터 냄 : ");
		System.out.println(com);
		
			
		// 방법 1
//		if (you == com) System.out.println("비김");
//		else {
//			if (you > com) {
//				if (you == 3 && com == 1) System.out.println("컴 이김");
//				else System.out.println("나 이김");
//			}
//			else {
//				if (you == 1 && com == 3) System.out.println("나 이김");
//				else System.out.println("컴 이김");
//			}
//		}
		
		// 방법 2
//		if (you == com) System.out.println("비김");
//		else {
//			
//			
//			if (you > com) {
//				System.out.println("나 이김");
//			}
//			else {
//				System.out.println("컴 이김");
//			}
//		}
		
		
			
		
	}
}
