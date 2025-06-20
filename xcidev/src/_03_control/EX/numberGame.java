package _03_control.EX;

import java.util.Scanner;

public class numberGame {
	public static void main(String[] args) {
		
		
	
		// 0 ~ 9 사이 중복되지 않은 숫자 3개
		
		// 같은자리에 숫자까지 같으면 스트라이크
		// 숫자만 맞추면 볼
		
		Scanner sc = new Scanner(System.in);
		
		int s, b; //스트라이크, 볼
		int c1, c2, c3;
		int h1, h2, h3; // 사람이 입력한 수
		int count = 0;
		
		
		
		// 3개 숫자 뽑기
		c1 = (int)(Math.random() * 10);
		do {
			c2 = (int) (Math.random() * 10);
		} while (c1 == c2);
		
		do {
			c3 = (int) (Math.random() * 10);
		} while (c3 == c1 || c3 == c2);
		
		
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
		
		
		// 실행
		do {
			s = b = 0;
			System.out.print("0 ~ 9 사이의 중복되지 않은 숫자 3개 입력 (ex: 7 0 2)");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			// 첫번째 수 검증
			if (h1 == c1) s++;
			else if(h1 == c2 || h1 == c3) b++;
			
			// 두번째 수 검증
			if (h2 == c2) s++;
			else if (h2 == c1 || h2 == c3) b++;
			
			// 세번째 수 검증
			if (h3 == c3) s++;
			else if (h3 == c1 || h3 == c2) b++;
			
			System.out.println(s + "S" + b + "B");
			count++;
			
			
		} while (s != 3);
		
		System.out.printf("축하축하 %d번 만에 맞추셨슴다", count);
		
		sc.close();
		
	}

}
