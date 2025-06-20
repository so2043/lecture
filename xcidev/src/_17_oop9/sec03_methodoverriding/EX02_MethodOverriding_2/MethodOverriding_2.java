package _17_oop9.sec03_methodoverriding.EX02_MethodOverriding_2;

class Animal {
	void cry() {}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("짹짹🐣🐥🐤🐣🐥🐤");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("애용~🐱🐱🐱🐱🐱🐱🐱");
	}
}
	
class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}



public class MethodOverriding_2 {
	public static void main(String[] args) {
	
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		System.out.println();

		
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		System.out.println();
		
		Animal[] animals = {ab, ac, ad};
		for (Animal x : animals) x.cry();
		
	
	}

}
