package _18_abstract.sec02_abstractmodifier.EX02_AbstractModifier_2;

abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}



public class AbstractModifier_2 {
	public static void main(String[] args) {
		
		// 추상 클래스를 상속해서 오버라이딩
		
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.cry();
		animal2.cry();
		
	}
}
