package _10_oop4.sec04_thiskeyword.EX04_thiskeyword.EX01_ThisKeyword_1;

// 클래스 내부에서 필드, 메서드에 앞에 자동으로 붙는 this 키워드
class A {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}
	
	void work() {
		this.init(2, 3);
	}
}




public class ThisKeyword_1 {
	public static void main(String[] args) {
		
		// 클래스 객체 생성
		A a = new A();
		
		// 메서드 호출
		a.work();
		
		// 필드값 활용
		System.out.println(a.m);
		System.out.println(a.n);
	}
}
