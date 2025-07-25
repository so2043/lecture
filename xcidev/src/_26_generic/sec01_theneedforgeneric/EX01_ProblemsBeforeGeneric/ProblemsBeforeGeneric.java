package _26_generic.sec01_theneedforgeneric.EX01_ProblemsBeforeGeneric;



class Apple{
	@Override
	public String toString() {
		return "Apple";
	}
}
class Goods1 {
	private Apple apple;
	
	public Apple getApple() {
		return apple;
		
	}
	
	public void setApple(Apple apple) {
		this.apple = apple;
		
	}
}

class Pencil {
	@Override
	public String toString() {
		return "Pencil";
	}
}
class Goods2 {
	private Pencil pencil;
	
	public Pencil getPencil() {
		return pencil;
	}
	
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}





public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();
		System.out.println(apple.toString());
		
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
		System.out.println(pencil.toString());
	}
}
