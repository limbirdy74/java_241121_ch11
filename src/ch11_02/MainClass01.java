package ch11_02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
// import java.util.*  //  이렇게 해도 되지만 이러면 무거워 짐

public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();  // Date 클래스로 객체 생성
		String stringNow1 = now.toString();
		System.out.println(stringNow1);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String stringNow2 = simpleDateFormat.format(now);
		System.out.println(stringNow2);
		
//		Calendar now2 = new Calendar(); // 추상클래스 인스턴스 생성불가
		Calendar now2 = Calendar.getInstance();
		System.out.println(now2.get(Calendar.YEAR));  // 연도
		System.out.println(now2.get(Calendar.MONTH) + 1);  // 월은 +1 을 해줘야 한다. 0부터 시작
		System.out.println(now2.get(Calendar.DAY_OF_MONTH));  // 일
		System.out.println(now2.get(Calendar.HOUR));  // 시간
		System.out.println(now2.get(Calendar.MINUTE));  // 분
		System.out.println(now2.get(Calendar.SECOND));  // 초
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis()); // seed 값을 현재시간으로 설정
//		random.setSeed(0);  // seed 값을 주면 램덤값이 바뀌지 않음
		
		int lotto2 = random.nextInt(45) + 1;
		System.out.println(lotto2);  // 1 ~ 45 사이의 램덤 수
		double ran1 = random.nextDouble();
		System.out.println(ran1);  // 0 ~ 1 사이의 램덤 실수
		
	}

}
