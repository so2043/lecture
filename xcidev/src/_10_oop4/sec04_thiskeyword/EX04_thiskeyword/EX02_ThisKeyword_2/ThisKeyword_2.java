package _10_oop4.sec04_thiskeyword.EX04_thiskeyword.EX02_ThisKeyword_2;

class A {
	int m;
	int n;
	void init(int m, int n) {
		m = m;
		n = n;
	}
}

class B {
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}

public class ThisKeyword_2 {
	public static void main(String[] args) {
		
		// 필드명과 지역 변수명이 같음
		// this 키워드 사용 안함
		A a = new A();
		a.init(2, 3);
		System.out.println(a.m); // 필드변수 가져오기 => 클래스 A에서 필드변수에 저장이 안됨
		System.out.println(a.n); 
		
		// 필드명과 지역 변수명이 같음
		// this 키워드 사용
		B b = new B();
		b.init(2, 3);
		System.out.println(b.m); // 필드변수 가져오기 => 클래스 B에서 this 사용해서 필드변수에 저장
		System.out.println(b.n);
	}
}
