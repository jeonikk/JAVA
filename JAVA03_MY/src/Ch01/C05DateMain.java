package Ch01;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class C05DateMain {

	public static void main(String[] args) {
		
////		Date
//		Date d1 = new Date();
//		System.out.println(d1);
//		
//		System.out.println(d1.getYear()+1900+"년");//1900 입력해줘야 현재 년도 출력
//		System.out.println(d1.getMonth()+1+"월");// 0 부터 시작
//		System.out.println(d1.getDay()+"요일");	//0~6(일~토)
//		System.out.println(d1.getHours()+"시");
//		System.out.println(d1.getMinutes()+"분");
//		System.out.println(d1.getSeconds()+"초");
//		System.out.println(d1.getTime()+"시간");	//타임스탬프(HH:MM:SS 시:분:초)
		
		
////		Calendar
//		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		System.out.println(cal.get(Calendar.YEAR)+"\s년");
//		System.out.println(cal.get(Calendar.MONTH)+1+"\s월");
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"\s일");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+"\s요일");	//요일
//															// 1~7(일~토)
//		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"\s시");
//		System.out.println(cal.get(Calendar.MINUTE)+"\s분");
//		System.out.println(cal.get(Calendar.SECOND)+"\s초 \n입니다");
		
//		LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		
//		연,월,일,시,분,초 가져오기
		int year = now.getYear();
		int month = now.getMonthValue();// 월 (1~12)
		int day = now.getDayOfMonth();	// 일 (1~31)
		int hour = now.getHour();		// 시 (0~23)
		int minute = now.getMinute();	// 분 (0~59)
		int second = now.getSecond();	// 초 (0~59)
		DayOfWeek dayOfweek = now.getDayOfWeek();
		
//		결과 출력
		System.out.println("년: "+year);
		System.out.println("월: "+month);
		System.out.println("일: "+day);
		System.out.println("시: "+hour);
		System.out.println("분: "+minute);
		System.out.println("초: "+second);
		System.out.println("요일: "+ dayOfweek);
		
	}

}
