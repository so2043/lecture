package _21_oop11_2;

public class LgTV implements TV {
	
	
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV : 제품이 생성됨");
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("LgTV : 전원을 ON");
	}

	public void powerOff() {
		System.out.println("LgTV : 전원을 OFF");
	}

	public void soundUp() {
		if (speaker == null)
			System.out.println("LgTV : 소리 UP");
		else
			speaker.soundUp();
	}

	public void soundDown() {
		if (speaker == null)
			System.out.println("LgTV : 소리 Down");
		else
			speaker.soundDown();
	}
 
	public void channelUp() {
		System.out.println("LgTV : 채널 UP");
	}

	public void channelDown() {
		System.out.println("LgTV : 채널 Down");
	}

}
