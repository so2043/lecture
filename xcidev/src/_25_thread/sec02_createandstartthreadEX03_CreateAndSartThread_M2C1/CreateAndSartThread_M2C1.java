package _25_thread.sec02_createandstartthreadEX03_CreateAndSartThread_M2C1;


// Runnable 인터페이스를 상속해 클래스를 생성한 후 쓰레드 2개 생성



class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		
		// 자막 번호 하나 - 다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		
		// 자막 번호 출력
		for (int i=0; i<strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}



public class CreateAndSartThread_M2C1 {
	public static void main(String[] args) {

		
		Runnable smiFileRunnable =  new SMIFileRunnable();
		
		Thread thread = new Thread(smiFileRunnable);
		thread.start();
		
		// 비디오 프레임 1-5
		int[] intArray = {1, 2, 3, 4, 5};
		
		// 비디오 프레임 출력
		for (int i=0; i<intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		
	}

}
