package _21_oop11_2;

public class AppleSpeaker implements Speaker{

	AppleSpeaker() {
		System.out.println("AppleSpeaker : 제품이 생성됨");
	}
	
	@Override
	public void soundUp() {
		System.out.println("AppleSpeaker : 소리 업");
		
	}

	@Override
	public void soundDown() {
		System.out.println("AppleSpeaker : 소리 업");		
	}

}
