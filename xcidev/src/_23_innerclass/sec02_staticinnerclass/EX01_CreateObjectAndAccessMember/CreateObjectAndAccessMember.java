package _23_innerclass.sec02_staticinnerclass.EX01_CreateObjectAndAccessMember;


class A {
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	
	// 정적 이너 클래스
	static class B {
		void bcd() {
			
//			System.out.println(a);		// static 변수가 아니라서 못 읽어옴
			System.out.println(b);
//			method1();					// static 메서드가 아니라서 못 읽어옴
			method2();
		}
	}
	
}


public class CreateObjectAndAccessMember {
	public static void main(String[] args) {
		
		A.B b = new A.B();
		b.bcd();
		
	}
}
