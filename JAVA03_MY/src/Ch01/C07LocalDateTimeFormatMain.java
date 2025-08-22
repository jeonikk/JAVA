package Ch01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C07LocalDateTimeFormatMain {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("YYYY/MM/DD 입력 : ");
//		String ymd = sc.next();
//		
////		입력용 포매터
//		DateTimeFormatter fmtin = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		
////		문자열을 LocalDate로 변환
//		LocalDate date = LocalDate.parse(ymd,fmtin);
//		System.out.println("입력된 날짜 : "+date+"\s입니다.");
//		
////		출력용 포매터
//		DateTimeFormatter fmtout = DateTimeFormatter.ofPattern("yyyy/MM/dd");
////		포맷 변경 후 출력
//		System.out.println("변환된 날짜 : "+date.format(fmtout));
//		
//		sc.close();
		
//		날짜시간 포매팅
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY/MM/DD HH:MM:SS 입력 : ");
		String ymd = sc.nextLine();
		
//		포매터 객체 생성(입력용)
		DateTimeFormatter fmtin = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime date = LocalDateTime.parse(ymd,fmtin);
		System.out.println("입력된 날짜와 시간 : "+date+"\s입니다.\n");
		
//		출력용
		DateTimeFormatter fmtout = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println("변환된 날짜와 시간 : "+date.format(fmtout)+"\s입니다.");
		
	}

}
