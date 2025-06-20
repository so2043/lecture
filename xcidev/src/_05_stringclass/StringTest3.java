package _05_stringclass;

public class StringTest3 {
	public static void main(String[] args) {
		
		// StringBuilder
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity() + " : " + sb.toString());
		
		sb.append("실수란 ");
		System.out.println(sb.capacity() + ":" + sb.toString());
		sb.append("신을 ");
		System.out.println(sb.capacity() + ":" + sb.toString());
		sb.append("용서하는 ");
		System.out.println(sb.capacity() + ":" + sb.toString());
		sb.append("인가늬 ");
		System.out.println(sb.capacity() + ":" + sb.toString());
		sb.append("행위ㅇㅇㅇㅇㅇㅇ");
		System.out.println(sb.capacity() + ":" + sb.toString());
	}

}
