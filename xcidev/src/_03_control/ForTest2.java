package _03_control;

public class ForTest2 {
	public static void main(String[] args) {
		
		int sum = 0; // 초기화
		
//		
//		for (int i=1; i<=3; i++) {
//			sum += i;
//		}
		
		
		// 1 ~ 1000까지 3의 배수 구하기
		// 방법 1
		for (int i=1; i<=1000; i++) {
			if (i % 3 == 0) sum +=i;
		}
		
		// 방법 2
//		for (int i=3; i<=1000; i+=3) {
//			sum += i;
//		}
		
		
		
		System.out.println(sum);
		
		
		
		
	
		System.out.println("종료");
	}
}
