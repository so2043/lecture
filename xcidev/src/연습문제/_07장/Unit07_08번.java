package 연습문제._07장;

class F {
	
	int a, b, c, d;
	
	F() {
		this(5);
	}
	
	F(int k) {
		a = k;
		b = k;
		c = k;
		d = k;
	}
}


public class Unit07_08번 {
	public static void main(String[] args) {
		
		F f = new F();
		System.out.println(f.a);
		System.out.println(f.b);
		System.out.println(f.c);
		System.out.println(f.d);
		
	}
}
