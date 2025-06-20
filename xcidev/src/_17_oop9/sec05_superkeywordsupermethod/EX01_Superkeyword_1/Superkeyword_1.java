package _17_oop9.sec05_superkeywordsupermethod.EX01_Superkeyword_1;


class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}


class B extends A {
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		abc(); 		// this가 없어서 가까운 abc() 찾아서 실행 => B클 abc()
	}
}


public class Superkeyword_1 {
	public static void main(String[] args) {
		
		B bb = new B();
		
		bb.bcd();
	}
}
