package _30_lambda.sec01_lambdaexpression.EX05_RefOfStaticMethod;

interface A {
	void abc();
}

class B {
	static void bcd() {
		System.out.println("메서드");
	}
}


public class RefOfStaticMethod {

	public static void main(String[] args) {

		
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public void abc() {
				B.bcd();
			}
		};
		
		
		// 2. 람다식으로 표현
		A a2 = () -> {B.bcd();};
		
		// 3. 정적 메서드 참조
		A a3 = B::bcd;
		
		
		a1.abc();
		a2.abc();
		a3.abc();
	}

}
