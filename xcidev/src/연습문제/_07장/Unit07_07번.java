package 연습문제._07장;

class E {
	
	
	int m = 3;
	int n = 5;
	
	void abc(int m, int n) {
		m = this.m; // 3
		n = n;		// 8
	}
}


public class Unit07_07번 {
	public static void main(String[] args) {
		
		E e = new E();
		e.abc(7, 8);
		
		System.out.println(e.m); // 3
		System.out.println(e.n); // 5
		
	}
}
