package _14_oop6;

public class SingleTest {
	public static void main(String[] args) {
		
		
//		Single s1 = new Single();
//		Single s2 = new Single();
//		
//		System.out.println(s1.hashCode()); 
//		System.out.println(s2.hashCode()); 
		// 위에 두개 해시코드 다름
		// 서로 다른 객체임
		
		
		// Single.java
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
		// 위에 두개 해시코드 같음
		// 같은 객체 바라봄
		
		
		
		// Single2.java
		Single2 s3 = Single2.getInstance();
		Single2 s4 = Single2.getInstance();
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
		// 위에 두개 해시코드 같음
		// 같은 객체 바라봄
		
	}
}
