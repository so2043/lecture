package _03_control.EX;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력 하시오 > ");
		int year = sc.nextInt();
		
		System.out.println("월을 입력 하시오 > ");
		int month = sc.nextInt();
	
		Calendar c = Calendar.getInstance();
		// 월은 -1 해줘야함
		// 0부터 시작한다고 생각
		c.set(year, month-1, 1);
		
		
		// 요일 숫자로 가져오기 (일요일:1 ~ 토요일:7)
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		// 마지막날 가져오기 (30, 31, 28 등등)
		int end = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("일 월 화 수 목 금 토");
		
		for (int w=1; w<week; w++) {
			System.out.print("   ");
		}
		for (int d=1,w=week; d<=end; d++,w++) {
			System.out.print(d < 10 ? " " + d + " " : d + " "); //글자수처리
			if (w % 7 == 0) System.out.println();
		}
		
	}
}
