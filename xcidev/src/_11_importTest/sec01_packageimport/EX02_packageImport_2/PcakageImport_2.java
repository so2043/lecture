package _11_importTest.sec01_packageimport.EX02_packageImport_2;

import _11_importTest.sec01_packageimport.common.A;


public class PcakageImport_2 {
	public static void main(String[] args) {
		
		// 객체 생성
		// import를 사용하여 다른 패키지에서 가져옴
		A a = new A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
	}
}
