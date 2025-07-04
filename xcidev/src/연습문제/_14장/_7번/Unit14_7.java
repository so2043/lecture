package 연습문제._14장._7번;



class ScoreException extends Exception {
	public ScoreException() {
		
	}
	ScoreException(String s) {
		super(s);
	}
}

class A {
	void abc(double score) throws ScoreException {
		if (score >= 3.0) {
			System.out.println("장학금 대상자입니다.");
		} else {
			throw new ScoreException("학점 미달입니다");
		}
	}
}



public class Unit14_7 {

	public static void main(String[] args) {
		
		A a = new A();
		try {
			a.abc(3.8);
			a.abc(2.5);
		} catch (ScoreException e) {
			System.out.println(e.getMessage());
		}
	}

	// 장학금 대상자 입니다.
	// 학점 미달입니다.
}
