package _10_oop4.sec05_thismethod.EX02_ThisMethod_2;


class A {
	
	int m1,m2,m3,m4;
	
	A() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	A(int a) {
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	A(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

class B {
	
	int m1,m2,m3,m4;
	
	B() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	B(int a) {
		this();
		m1 = a;
	}
	
	B(int a, int b) {
		this(a);
		m2 = b;
		
		// 이렇게도 가능
//		this();
//		m1 = a;
//		m2 = b;
	}
	
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}



public class ThisMethod_2 {
	public static void main(String[] args) {
		
		// this 사용 안함
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10, 20);
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		// this 사용
		// 편리함
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10, 20);
		b1.print();
		b2.print();
		b3.print();
		System.out.println();
		
	}
}
