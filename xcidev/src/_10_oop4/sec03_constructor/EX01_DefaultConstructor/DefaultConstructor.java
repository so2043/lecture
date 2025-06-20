package _10_oop4.sec03_constructor.EX01_DefaultConstructor;

public class DefaultConstructor {
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
//		C c = new C(); 	// 기본 생성자 호출 불가능 (직접 작성한 생성자 있어서)
		C c = new C(3);
		
		// 메서드 호출
		a.work();
		b.work();
		c.work();
		
	}
	
	

}


class A {
	int m;
	void work() {
		System.out.println(m);
	}
	// 기본 생성자
	// 안만들면 컴파일러가 기본 생성자를 자동으로 추가함
//	A() {}
}

class B {
	int m;
	void work() {
		System.out.println(m);
	}
	B() {}
}

class C {
	int m;
	void work() {
		System.out.println(m);
	}
	
	C (int a) {
		m = a;
	}
}
