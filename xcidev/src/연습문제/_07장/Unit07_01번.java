package 연습문제._07장;


class A {
	boolean a;
	int b;
	double c;
	String d;

	void abc() {
		System.out.println(b + c);
		System.out.println(c + d);
		System.out.println(d + a);
		
	}
}


public class Unit07_01번 {
	public static void main(String[] args) {
		
		
		A a = new A();
		a.abc();
		
		
	}
}
