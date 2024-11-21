package ch11_01;

public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "123";
		
		// 문자열 -> 정수
		int a = Integer.parseInt(num) + 100;
		System.out.println(a);
		
		// 정수, 실수 --> 문자열
		String num2 = String.valueOf(100);
		System.out.println(num2);

	}

}
