package _03_control;

public class ForTest1 {
	public static void main(String[] args) {
		
		// 방법 1
		for (int n=1; n<=3; n++) {
			System.out.println(n * 10 + " : sysone");
		}
		
		
		// 방법 2
		for (int n=10; n<=30; n+=10) {
			System.out.println(n + " : sysone");
		}
		
		
	
		System.out.println("종료");
	}
}
