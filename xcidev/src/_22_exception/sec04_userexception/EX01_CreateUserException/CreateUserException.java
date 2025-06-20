package _22_exception.sec04_userexception.EX01_CreateUserException;


// 1. 사용자 일반 예외
class MyException extends Exception {
	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message);
	}
}

public class CreateUserException {

}
