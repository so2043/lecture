package _03_control.EX;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
	
		Calendar c = Calendar.getInstance();
		// 월은 -1 해줘야함
		// 0부터 시작한다고 생각
		c.set(2025, 5, 7);
		
		
		// 요일 숫자로 가져오기 (일요일:1 ~ 토요일:7)
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		
		// 마지막날 가져오기 (30, 31, 28 등등)
		int end = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(end);
		
		
	}
}
