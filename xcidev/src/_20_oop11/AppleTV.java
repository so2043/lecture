package _20_oop11;

public class AppleTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("AppleTV : 켬");

	}

	@Override
	public void powerOff() {
		System.out.println("AppleTV : 끔");

	}

	@Override
	public void soundUp() {
		System.out.println("AppleTV : 소리 업");

	}

	@Override
	public void soundDown() {
		System.out.println("AppleTV : 소리 다운");

	}

	@Override
	public void channelUp() {
		System.out.println("AppleTV : 채널 업");

	}

	@Override
	public void channelDown() {
		System.out.println("AppleTV : 채널 다운");

	}

}
