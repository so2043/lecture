package _14_oop6;

public class Single {

	// 싱글톤패턴
	// Lazy Initialization : 지연 초기화
	
	private static Single single;
	
	private Single() {}
	
	
	// 최초 한번만 생성하고
	// 그 뒤로는 똑같은거 가져다가 쓸거임
	public static Single getInstance() {
		if (single == null) {
			single = new Single();
		}
		return single;
	}
	
	
}
