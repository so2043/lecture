package _15_oop7.sec01_inheritancepolymorphism.EX01_Inheritance;

class Human {
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human {
	int studentID;
	void goToSchool() {}
}

class Worker extends Human {
	int workerID;
	void goToWork() {}
}

public class Inheritance {
	public static void main(String[] args) {
		
		// human 객체 생성
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		
		// student 객체 생성
		Student s = new Student();
		s.name = "민성";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		// worker 객체 생성
		Worker w = new Worker();
		w.name = "윤정";
		w.age = 45;
		w.workerID = 129;
		w.eat();
		w.sleep();
		w.goToWork();
		
	}	
}
