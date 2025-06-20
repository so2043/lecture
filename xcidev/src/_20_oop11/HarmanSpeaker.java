package _20_oop11;

public class HarmanSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("HarmanSpeaker : 소리 업");
		
	}

	@Override
	public void soundDown() {
		System.out.println("HarmanSpeaker : 소리 다운");
		
	}

	
}
