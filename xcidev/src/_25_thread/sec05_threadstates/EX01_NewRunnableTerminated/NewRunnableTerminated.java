package _25_thread.sec05_threadstates.EX01_NewRunnableTerminated;

public class NewRunnableTerminated {

	public static void main(String[] args) {

		
		Thread.State state;
		
		
		
		
		// 1. 객체 생성
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i=0; i<100000000L; i++) {}
			}
		};
		
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		
		// 2. myThread 시작
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		
		// 3. myThread 종료
		try {
			myThread.join();
		} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state = " + state);
	}

}
