package 연습문제._12장._2번;


abstract class A {
	abstract void abc();
}

class B extends A {

	@Override
	void abc() {
		System.out.println("안녕하세요");	
	}
}


public class Unit12_2 {
	public static void main(String[] args) {
		A a = new B();
		a.abc();
	}
}
