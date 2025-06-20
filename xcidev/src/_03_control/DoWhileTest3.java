package _03_control;

public class DoWhileTest3 {
	public static void main(String[] args) {
		
		
		int dice1, dice2;
		
		dice1 = (int)(Math.random() * 6) + 1; // int 형변환 위치 중요
		do {
			dice2 = (int) (Math.random() * 6) + 1; 
		} while (dice2 == dice1);					// 같은 값이 나오면 조건이 참이므로 do안의 실행문 실행 => 겹치는 수 안나옴 	
		
		
		
		System.out.println(dice1 + ", " + dice2);
		System.out.println("종료");
		
		
		
		
		
		
		
	}
}
