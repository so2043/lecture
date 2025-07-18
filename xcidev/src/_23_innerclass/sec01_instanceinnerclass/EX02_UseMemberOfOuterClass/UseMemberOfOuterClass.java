package _23_innerclass.sec01_instanceinnerclass.EX02_UseMemberOfOuterClass;


class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	void abc() {
		System.out.println("A 클래스 메서드");
	}
	
	
	// 이너 클래스
	class B {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		
		void bcd() {
			// 이너 클래스의 멤버 호출 또는 사용
			System.out.println(a);
			System.out.println(b);
			abc();
			
			
			// 아우터 클래스의 멤버 호출 또는 사용
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
}





public class UseMemberOfOuterClass {
	public static void main(String[] args) {
		
		A a = new A();
		
		A.B b = a.new B();
		b.bcd();
	}
}
