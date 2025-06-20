package _18_abstract.sec01_abstractclass.EX02_AbstractClass_2;



// 자식 클래스 안만들어
// 익명 이너 클래스 방법
// A a1 = new A() 마치 객체 생성하듯 만드는 방법

// 두번이상 쓸 경우엔 이방법 비추
// 객체 생성 할 때 마다 각각 오버라이딩 필요해서 중복 코드 발생 !

abstract class A {
	abstract void abc();
}


public class AbstractClass_2 {
	public static void main(String[] args) {
		
		A a1 = new A() {
			void abc() {
				System.out.println("방법 2 : 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		A a2 = new A() {
			void abc() {
				System.out.println("방법 2 : 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		a1.abc();
		a2.abc();
	}
}
