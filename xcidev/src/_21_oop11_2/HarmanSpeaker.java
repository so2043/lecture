package _21_oop11_2;

public class HarmanSpeaker implements Speaker {

	public HarmanSpeaker() {
		System.out.println("HarmanSpeaker : 제품이 생성됨");
	}
	
	@Override
	public void soundUp() {
		System.out.println("HarmanSpeaker : 소리 업");
		
	}

	@Override
	public void soundDown() {
		System.out.println("HarmanSpeaker : 소리 다운");
		
	}

}
