package 연습문제._12장._8번;


interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A {
	
	public void abc() {
		A.super.abc();
		System.out.println("B 클래스의 abc()");
	}
	
}


public class Unit12_8 {
	public static void main(String[] args) {
		
		
		B b = new B();
		b.abc();
		
	}
}
