package _30_lambda.sec01_lambdaexpression.EX07_RefOfInstanceMethod_Type2_2;


interface A {
	String abc(String str);
}


public class RefOfInstanceMethod_Type2_2 {

	public static void main(String[] args) {

		
		
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public String abc(String str) {
				return str.toLowerCase();
			}
		};

		
		// 2. 람다식
		A a2 = (String str) -> str.toLowerCase();
		
		
		// 3. 자바가 제공하는 인스턴스 메서드 참조
//		A a3 = String::length;
//		A a3 = str -> str.toUpperCase();
		A a3 = String::toUpperCase;
		
		
		
		
		System.out.println(a1.abc("BBBBBBB"));
		System.out.println(a2.abc("DDDFDFD"));
		System.out.println(a3.abc("mac"));
		
	}

}
