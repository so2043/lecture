package 연습문제._13장_6번;


class A {
	int m = 3;
	int n = 5;
	
	void abc() {
		int n = 5;
		
		class B {
			void bcd() {
				m = m+1; System.out.println(m);
//				n = n+1; System.out.println(n);
			}
		}
		
		B b = new B();
		b.bcd();
	}
}

public class Unit13_6 {

	public static void main(String[] args) {		
		A a = new A();
		a.abc();
		
	}

}
