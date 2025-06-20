package _02_operation;

public class OpTest3 {
	public static void main(String[] args) {
		
		// 논리연산자
		
		boolean b1 = true, b2 = false;
		
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
		
		
		// 비트연산자
		
		int n1 = 5, n2 = 3;
		// 5 : 101
		// 3 : 011
		
		System.out.println(n1 & n2);	// 두개 모두 1이면 1
		System.out.println(n1 | n2);	// 두개 모두 0이면 0
		
		
		// 두수를 치환하는 방법
		n1 = n1 ^ n2;
		n2 = n2 ^ n1;
		n1 = n1 ^ n2;
		System.out.println(n1 + "," + n2);
		
		
		System.out.println("종료");
		
		
	}
}
