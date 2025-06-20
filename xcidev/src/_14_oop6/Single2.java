package _14_oop6;

public class Single2 {

	// 싱글톤패턴
	// Eager Initialization : 조기 초기화
	
	
	
	public static final Single2 single = new Single2();
	
	private Single2() {}
	
	public static Single2 getInstance() {
		return single;
	}
	
}
