package ch11_01;

public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = Math.abs(-12015);
		System.out.println(a1);
		
		// 올림
		double a2 = Math.ceil(3.14);
		System.out.println(a2);
		
		// 버림
		double a3 = Math.floor(3.14);
		System.out.println(a3);
		
		// 반올림
		double a4 = Math.round(3.14);
		System.out.println(a4);
		
		// Math.random()  -->  0.0 <= x < 1.0 double 타입으로 변환
		int a5 = (int)(Math.random() * 10) + 1;  // 1 ~ 10
		System.out.println(a5); 
		
		int lotto = (int)(Math.random() * 45) + 1;  // 1 ~ 45 int 타입으로 반환
		System.out.println(lotto);
		
	}

}
