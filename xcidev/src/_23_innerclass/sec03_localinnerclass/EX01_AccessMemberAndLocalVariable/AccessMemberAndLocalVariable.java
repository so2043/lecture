package _23_innerclass.sec03_localinnerclass.EX01_AccessMemberAndLocalVariable;



class A {

	int a = 3;

	void abc() {
		int b = 5;
		
		// 지역 이너 클래스
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a=5;
//				b=7;			// 지역 이너 클래스에 지역변수는 자동 final변수
			}
		}
		B bb = new B();
		bb.bcd();
	}
}


public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		
		A a = new A();
		a.abc();
	}
}
