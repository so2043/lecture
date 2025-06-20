package _10_oop4.sec05_thismethod.EX01_ThisMethod_1;

class A {
	
	A() {
		System.out.println("첫번째 생성자");
	}
	
	A(int a) {
		this();
		System.out.println("두번째 생성자");
	}
	
	void abc() {	
//		this();		// 일반메서드는 this 사용 불가함
	}
}



public class ThisMethod_1 {
	public static void main(String[] args) {
		
		A a1 = new A();
		System.out.println();
		
		A a2 = new A(3);
	}

}
