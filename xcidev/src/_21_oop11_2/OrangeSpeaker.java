package _21_oop11_2;

public class OrangeSpeaker implements Speaker {

	public OrangeSpeaker() {
		System.out.println("OrangeSpeaker : 제품이 생성됨");
	}
	
	
	@Override
	public void soundUp() {
		System.out.println("OrangeSpeaker : 소리 업");
	}

	@Override
	public void soundDown() {
		System.out.println("OrangeSpeaker : 소리 다운");
	}
	
	

}
