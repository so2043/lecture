package _10_oop4.sec02_method.EX01_ExternalCallMethods;


class A {
	
	
	void print() {
		// 리턴타입 	 : void 
		// 입력 매개변수 : 없음
		System.out.println("안녕");
	}
	
	
	int data() {
		// 리턴타입 	 : int
		// 입력 매개변수 : 없음
		return 3;
	}
	
	
	double sum(int a, double b) {
		// 리턴타입 	 : double
		// 입력 매개변수 : 2개
		return a + b;
	}
	
	
	void printMonth(int m) {
		// 리턴타입 	 : void
		// 내부에 리턴 포함 (함수종료)
		if (m<0 || m>12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m + "월 입니다!");
	}
	
	
}

public class ExternalCallMethods {
	public static void main(String[] args) {
	
		// 객체 생성
		A a = new A();
		
		// 메서드 호출(멤버 활용)
		a.print();						// 안녕
		
		int k = a.data();				// k=3
		a.data();						// 3
		System.out.println(k);			// 3
		
		double result = a.sum(3, 5.2);	// result = 8.2
		System.out.println(result);		// 8.2
		
		a.printMonth(5);				// 5월 입니다!
		a.printMonth(15);				// 잘못된 입력
		
	}
}
