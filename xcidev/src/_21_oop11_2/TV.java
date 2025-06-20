package _21_oop11_2;

public interface TV {
	
	// 다른 자식들에게 영향이 안가도록 default 메서드 사용
	default void setSpeaker(Speaker speaker) {}
	
	void powerOn();
	
	void powerOff();
	
	void soundUp();
	
	void soundDown();
	
	void channelUp();
	
	void channelDown();

}
