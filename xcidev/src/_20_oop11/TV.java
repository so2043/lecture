package _20_oop11;

public interface TV {


	
	// 표준 인터페이스 
	// 다 abstract 들어가 있음
	
	
	public default void setSpeaker(Speaker speaker) {};
	
	public abstract void powerOn();
	
	public void powerOff();
	
	public void soundUp();
	
	public void soundDown();
	
	public void channelUp();
	
	public void channelDown();
	
}
