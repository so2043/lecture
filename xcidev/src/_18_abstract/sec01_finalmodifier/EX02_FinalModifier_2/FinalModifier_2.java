package _18_abstract.sec01_finalmodifier.EX02_FinalModifier_2;


class A {
	void abc() {}
	final void bcd() {}
}

class B extends A{
	void abc() {}
//	void bcd() {}			// 상속관계라도 final 메서드는 오버라이딩 불가넝
}


final class C {}
//class D extends C {}		// final 클래스는 상속 자체가 불가넝

public class FinalModifier_2 {
	public static void main(String[] args) {
		
	}
}
