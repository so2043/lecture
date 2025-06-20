package _11_importTest.sec02_packageimport.EX02_ExternalClass_2;




class A {
	int m = 3;
	int n = 4;	

	void print() {
		System.out.println(m + ", " + n);
	}
}



public class ExternalClass_2 {
	public static void main(String[] args) {
		
		A a = new A();
		a.print();
	}
}
