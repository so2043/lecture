package _24_enum1;

public class PowerStateTest {
	public static void main(String[] args) {
		
		PowerState state = PowerState.SUSPEND;
		// 필드 값 접근
		System.out.println("현재 상태: " + state.name());
		System.out.println("상세 메시지: " + state.getMessage());
		// 메서드 호출
		state.printStatus();
	}

}
