package _02_operation;

public class OpTest5 {
	public static void main(String[] args) {
		
		// 축약연산자
		
		int a = 10;
		
		
		int b = a++;		// b = a
							// a = a + 1;
							// 후위연산으로 더했기 때문
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	}
}
