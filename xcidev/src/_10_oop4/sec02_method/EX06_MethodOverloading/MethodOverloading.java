package _10_oop4.sec02_method.EX06_MethodOverloading;

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		// 메서드 오버로딩
		
		print();
		print(3);
		print(5.8);
		print(2, 5);
	
	}
	

	public static void print() {
		System.out.println("데이터 없음");
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void print(double a) {
		System.out.println(a);
	}
//	public static void print(double b) { 이건 중복 불가 (입력 매개변수 타입이 같음)
//		System.out.println(a);
//	}
	
	public static void print(int a, int b) {
		System.out.println("a:" + a + " b:" + b);
	}
}
