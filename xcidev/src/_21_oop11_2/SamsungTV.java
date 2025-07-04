package _21_oop11_2;

public class SamsungTV implements TV {
	
//	private Speaker speaker = new HarmanSpeaker();
	
	private Speaker speaker;
	
	public SamsungTV() {
		System.out.println("SamsungTV : 제품이 생성됨");
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV : 전원을 ON");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV : 전원을 OFF");
	}
	
	public void soundUp() {
		if (speaker == null) 
			System.out.println("SamsungTV : 소리 UP");
		else
			speaker.soundUp();
	}
	
	public void soundDown() {
		if (speaker == null)
			System.out.println("SamsungTV : 소리 Down");
		else
			speaker.soundDown();
	}
	
	public void channelUp() {
		System.out.println("SamsungTV : 채널 UP");
	}
	
	public void channelDown() {
		System.out.println("SamsungTV : 채널 Down");
	}

}
