package _19_Interface.sec02_interface.EX03_InheritanceOfInterface_2;


interface A {
	public abstract void abc();
}

interface B {
	void bcd();
}

class C implements A {
	public void abc() {
		// 인터페이스 오버라이딩은 필수로 public
	}
}

/* 
class D implements B {
	void bcd() {}			
	
	// void 앞에 아무것도 안붙이면 default로 인식
	// 인터페이스 B는 pulic void bcd() 이기때문에
	// pulic => default 불가능함
}
*/

public class InheritanceOfInterface_2 {

}
