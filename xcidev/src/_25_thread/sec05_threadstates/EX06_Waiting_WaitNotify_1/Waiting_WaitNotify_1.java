package _25_thread.sec05_threadstates.EX06_Waiting_WaitNotify_1;


class DataBox {
	int data;
	synchronized void inputData(int data) {
		this.data = data;
		System.out.println("입력 데이터 : " + data);
	}
	
	synchronized void outputData() {
		System.out.println("출력 데이터 : " + data);
	}
}


public class Waiting_WaitNotify_1 {
	public static void main(String[] args) {
		
		DataBox dataBox = new DataBox();
	
		Thread t1 = new Thread() {
			public void run() {
				for (int i=1; i<9; i++) dataBox.inputData(i);;
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for (int i=1; i<9; i++) dataBox.outputData();;
			};
		};
		
		t1.start();
		t2.start();
		
		
	}
	
}
