package _09_oop3.sec01_createobjectandusageofmemvers.EX01_CreateObjectAndUsageOfMember;



// 클래스 정의
class A {
	int m = 3;
	void print() {
		System.out.println("객체 생성 및 활용");
	}
}



public class CreateObjectAndUsageOfMembers {
	public static void main(String[] args) {
		// 클래스로 객체 생성
		A a = new A();
		
		
		// 클래스 멤버 활용
		// 필드 활용 : 필드에 값을 읽기 or 쓰기
		a.m = 5;
		System.out.println(a.m);
		
		// 메서드 활용 : 메서드를 호출
		a.print();
		
		
	}

}
