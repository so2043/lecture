package _02_operation;

public class OpTest15 {
	public static void main(String[] args) {
		
		// 랜덤수는 0.0 이상이고, 1.0 미만
		// 0은 나오고 1은 안나옴
		
		
		
		
		int dice = (int)(Math.random() * 6 + 1);
		// 랜덤수는 0.00000 ~ 0.99999 사이의 수라서 * 6하면 0~5 까지이므로 +1 해줌
		System.out.println(dice);
		
		
		
		// 1. 4,5,6,7,8,9,10,11,12,13,14,15 중의 숫자만 출력되도록
		
//		System.out.println(Math.random());
		
		int random1 = (int)(Math.random() * 12 + 4);
		System.out.println(random1);
		
		
		// 2. 
		// 600, 700, 800, 900, 1000
		// 1100, 1200, 1300, 1400, 1500,
		// 1600, 1700, 1800, 1900, 2000,
		// 2100, 2200, 2300 중의 숫자만 출력
		
		
		int random2 = (int)(Math.random() * 18 + 6) * 100;
		System.out.println(random2);
		
		
		
		
	}
}
