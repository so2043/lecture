package _17_oop9.sec03_methodoverriding.EX04_Methodoverriding_4;

class A {
	protected void abc() {}
}


class B1 extends A {
	public void abc() {}
}

class B2 extends A {
	protected void abc() {}
}

class B3 extends A {
//	default void abc() {} 		//  접근 지정자 좁아져서 불가능
}

class B4 extends A {
//	private void abc() {}		// 접근 지정자 좁아져서 불가능
}


public class Methodoverriding_4 {
	public static void main(String[] args) {
		
	}
}
