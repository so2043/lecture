package _11_importTest.sec01_packageimport.EX01_PackageImport_1;

public class PackageImport_1 {
	public static void main(String[] args) {
		
		
		// 객체 생성
		// A a = new A();
		_11_importTest.sec01_packageimport.common.A a = new _11_importTest.sec01_packageimport.common.A();
		
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
