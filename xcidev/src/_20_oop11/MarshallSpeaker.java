package _20_oop11;

public class MarshallSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("MarshallSpeaker : 소리 업");
		
	}

	@Override
	public void soundDown() {
		System.out.println("MarshallSpeaker : 소리 다운");
		
	}

	
}
