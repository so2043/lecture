package _10_oop4;

class RefMe extends Object {
	
	public void RefMe() {
		System.out.println("RefMe() 수행");
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("ㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
	}
}

public class ReferenceTest {
	public static void main(String[] args) throws Exception{
		RefMe r1 = new RefMe();
		RefMe r2 = r1;
		
		r1 = null;		// 	r2가 참조중이라 소멸 안할듯
		System.gc();
		System.out.println("1. r1에 null 할당");
		Thread.sleep(1000);
		
		r2 = null;
		System.gc();
		System.out.println("2. r1에 null 할당");	// 참조하는애가 죽었기 때문에 소멸 가넝
		Thread.sleep(1000);
		
		System.out.println("종료");
	}
	

}

