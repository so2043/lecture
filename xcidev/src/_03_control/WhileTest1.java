package _03_control;

public class WhileTest1 {
	public static void main(String[] args) {
//		
//		// 방법 1
//		for (int n=1; n<=3; n++) {
//			System.out.println(n * 10 + " : sysone");
//		}
//		
//		
//		// 방법 2
//		for (int n=10; n<=30; n+=10) {
//			System.out.println(n + " : sysone");
//		}
//		
		
//		int n = 1;
//		while (n <= 3) {
//			System.out.println(n * 10 + " : sysone");
//			n++;
//		}
		
		// 1부터 1000까지 3의 배수 합계
		int sum = 0;
		int n = 1;
		
		while (n <= 1000) {
			if (n % 3 == 0) sum += n;
			n++;
		}
		
		
		
		System.out.println(sum);
		System.out.println("종료");
	}
}
