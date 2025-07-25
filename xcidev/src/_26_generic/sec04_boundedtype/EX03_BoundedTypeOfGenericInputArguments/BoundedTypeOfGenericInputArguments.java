package _26_generic.sec04_boundedtype.EX03_BoundedTypeOfGenericInputArguments;


class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T> {
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}


class Test {
	void method1(Goods<A> g) {}
	void method2(Goods<?> g) {}
	void method3(Goods<? extends B> g) {}
	void method4(Goods<? super B> g) {}
}



public class BoundedTypeOfGenericInputArguments {

	public static void main(String[] args) {

		Test t = new Test();
		
		
	}

}
