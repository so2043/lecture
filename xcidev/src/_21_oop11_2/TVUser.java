package _21_oop11_2;

public class TVUser {
	public static void main(String[] args) throws Exception {
		
//		TV tv = new SamsungTV();
		
		TV tv = TVFactory.getTV();
		tv.setSpeaker(SpeakerFactory.getSpeaker());
				
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.soundDown();
		tv.soundDown();
		tv.soundUp();
		tv.powerOff();
		
		
	}
}
