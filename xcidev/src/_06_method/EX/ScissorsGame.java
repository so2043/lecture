package _06_method.EX;

import java.util.Scanner;

public class ScissorsGame {
	public static void main(String[] args) {
		
//		String[] caption = {"가위", "바위", "보"};
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("가위는 1, 바위는 2, 보는 3을 입력 > ");
			int you = sc.nextInt();
			int com = (int)(Math.random()*3+1);
			
//			System.out.println("YOU : " + caption(you));
//			System.out.println("COM : " + caption(com));
			System.out.print("YOU : ");
			printCaption(you);
			System.out.print("COM : ");
			printCaption(com);
			
			
			
			String result = "";
			
			
			if (you == com) result = "무승부";
			else {
				if (you > com) {
					if (you == 3 && com == 1) result = "COM 승리";
					else result = "YOU 승리";
				}
				else {
					if (you == 1 && com == 3) result = "YOU 승리";
					else result = "COM 승리";
				}
			}
			
			
			System.out.print("결과 : " + result);
			
			
			
		}
		
	}
	
	private static void printCaption (int val) {
		switch(val) {
		case 1  : System.out.println("가위"); break;
		case 2  : System.out.println("바위"); break;
		case 3  : System.out.println("보"); break;
		default : System.out.println("에러"); break;
		}
	}

	private static String caption(int val) {
		switch(val) {
		case 1  : return "가위";
		case 2  : return "바위";
		case 3  : return "보";
		default : return "에러";
		}
	}
}
