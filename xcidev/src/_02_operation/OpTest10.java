package _02_operation;

public class OpTest10 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		b += ++a; 	// b = b + (++a)	// 전위연산자는 괄호 있다고 생각하면 좋다
		System.out.println(a + "," + b);
		
		
	}
}
