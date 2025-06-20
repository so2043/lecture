package _01_basic;

public class EarningOrLoss {
	public static void main(String[] args) {
		
		//캘리의 법칙
	
		double seed_money = 1_000_000;
//		System.out.println(seed_money);
		
		for (int i=1; i<=50; i++) {
			
			seed_money = seed_money + (seed_money/2 * 0.4);
			seed_money = seed_money - (seed_money/2 * 0.3);
			
			System.out.println(seed_money);
			
		}
		
		
	}
}
