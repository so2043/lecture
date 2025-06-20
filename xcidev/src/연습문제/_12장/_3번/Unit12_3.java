package 연습문제._12장._3번;

abstract class A {
	abstract void abc();
}


public class Unit12_3 {
	public static void main(String[] args) {
		
		
		A a = new A() {
			void abc() {
				System.out.println("반갑습니다.");
			}
		};
		
		a.abc();
		
	}
}
