package _22_exception;

import java.util.Random;
import java.util.Scanner;

public class ExceptionTest5 {
	public static void main(String[] args) {
		
//		int n = (int)(Math.random() * 99) + 1;
		Random random = new Random();
		int n = random.nextInt(99) + 1;
		int you = 0;
		int cnt = 0;
		
		try (Scanner sc = new Scanner(System.in)){
			
			while(true) {
				
				cnt++;
				
				System.out.print("** " + cnt + "번째 도전 ** " + "1 ~ 99 사이 정수를 입력하세요 >> ");
				if (!sc.hasNext()) {
					System.out.println("값이 잘못 입력 되었습니다.");
					sc.nextLine();
					continue;
				}
				you = sc.nextInt();
				sc.nextLine();
				
				if (!(1 <= you && you <= 99 )) {
					
					System.out.println("값의 범위가 틀렸습니다. 1 ~ 99 사이 정수를 입력하세요");
					
				} else if (you != n) {
					
					System.out.print("너의 입력 값은 " + you + " 입니다!! >> ");
					
					if ( you < n ) System.out.print("UP 하세여");
					else System.out.print("DOWN 하세여");
					
					System.out.println();
					System.out.println();
					
				} else {
					
					// (cnt-1) / 4
					
					// 함수사용
					if (cnt < 17) cnt = (int) Math.ceil((double)cnt/4);
					
					switch (cnt) {
					// 1 ~ 4
					case 0 :
					case 1 :
						System.out.println("Great~!");
						break;
					// 5 ~ 8
					case 2 :
						System.out.println("Good~!");
						break;
					// 9 ~ 12
					case 3 : 
						System.out.println("그럭저럭이군...");
						break;
					// 13 ~ 16
					case 4 :
						System.out.println("아숩네...");
						break;
					// 17 ~
					default :
						System.out.println("분발을 요구함");
						break;
					}
					break;
				}
			}
		}
		System.out.println("종료");
	}
}
