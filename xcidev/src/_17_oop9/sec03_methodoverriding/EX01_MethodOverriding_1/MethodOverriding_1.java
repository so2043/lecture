package _17_oop9.sec03_methodoverriding.EX01_MethodOverriding_1;

class A {
	void print() {
		System.out.println("A 클");	
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("B 클");
	}
}



public class MethodOverriding_1 {
	public static void main(String[] args) {
		
		// A 타입
		// A 생성자
		A aa = new A();
		aa.print();
		
		
		// B타입
		// B 생성자
		B bb = new B();
		bb.print();
		
		// A타입
		// B생성자
		A ab = new B();
		ab.print();
	}
}
