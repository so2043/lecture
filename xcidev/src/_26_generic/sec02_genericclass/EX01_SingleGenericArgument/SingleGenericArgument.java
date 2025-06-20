package _26_generic.sec02_genericclass.EX01_SingleGenericArgument;


class MyClass<T> {
	private T t;
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}



public class SingleGenericArgument {
	public static void main(String[] args) {
		
		
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("하이");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println(mc2.get());
		
		
		// 강한 타입 체크로 문법 오류 발생
//		The method set(Integer) in the type MyClass<Integer> is not applicable for the arguments (String)

//		MyClass<Integer> mc3 = new MyClass<>();
//		mc3.set("gkdl");
		
	}
}
