package _01_basic.sec01_datatype;

public class RangeOfVariableUse {
	public static void main(String[] args) {
		
	
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		} // value2는 여기 끝나면 사용 못함 
		
		System.out.println(value1);
		
	} // value1은 여기 끝나면 사용 못함
}
