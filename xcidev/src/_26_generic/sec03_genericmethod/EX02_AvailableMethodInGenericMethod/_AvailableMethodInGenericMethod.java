package _26_generic.sec03_genericmethod.EX02_AvailableMethodInGenericMethod;



class A {
	public <T> void method(T t) {		
//		System.out.println(t.length());			// 아직 String타입인지 정의 되지 않아서 String 관련 메서드 사용 안됨
		System.out.println(t.equals("하이"));
	}
}



public class _AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method("안녕");

	}

}
