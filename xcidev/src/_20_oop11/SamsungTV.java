package _20_oop11;

public class SamsungTV implements TV {
	
	
	public Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}


	public void powerOn() {
		System.out.println("SamsungTV : 전원을 켭니다 !");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV : 전원을 끕니다 ㅠㅠ");
	}
	
	public void soundUp() {
		if (speaker == null) 
			System.out.println("SamsungTV : 소리 업~ ");
		else
			speaker.soundUp();
	}
	
	public void soundDown() {
		if (speaker == null) 
			System.out.println("SamsungTV : 소리 다운");
		else 
			speaker.soundDown();
	}
	
	public void channelUp() {
		System.out.println("SamsungTV : 채널 올려");
	}
	
	public void channelDown() {
		System.out.println("SamsungTV : 채널 내려");
	}
	
}
