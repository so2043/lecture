package 연습문제._14장._5번;



class A {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	void bcd() throws  InterruptedException, ClassNotFoundException {
		Thread.sleep(1000);
		Class.forName("java.lang.Object");
	}
}




public class Unit14_5 {
	public static void main(String[] args) {
		
		
	}
}
