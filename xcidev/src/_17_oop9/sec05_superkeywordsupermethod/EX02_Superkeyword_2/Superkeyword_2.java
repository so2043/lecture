package _17_oop9.sec05_superkeywordsupermethod.EX02_Superkeyword_2;

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
		super.abc();	// super 붙여서 부모 클래스로 감
	}
}

public class Superkeyword_2 {
	public static void main(String[] args) {
		
		B bb = new B();
		
		bb.bcd();
	}	
}
