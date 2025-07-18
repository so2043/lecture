package _21_oop11_2;

public class AppleTV implements TV{
	
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	AppleTV() {
		System.out.println("AppleTV : 제품이 생성됨");
	}
	
	public void powerOn() {
		System.out.println("AppleTV : 전원을 ON");
	}
	
	public void powerOff() {
		System.out.println("AppleTV : 전원을 OFF");
	}
	
	public void soundUp() {
		if (speaker == null) 
			System.out.println("AppleTV : 소리 UP");
		else
			speaker.soundUp();
	}
	
	public void soundDown() {
		if (speaker == null)
			System.out.println("AppleTV : 소리 Down");
		else
			speaker.soundDown();
	}
	
	public void channelUp() {
		System.out.println("AppleTV : 채널 UP");
	}
	
	public void channelDown() {
		System.out.println("AppleTV : 채널 Down");
	}

}
