package Ch02;

public class C03변수_자료형 {

	public static void main(String[] args) {
		// 
		
		int num1;					//int만큼 크기의 공간형성 + num1이라는 이름부여(변수 정의)
		num1 = 10;					//변수에 10이라는 값을 부여
		int num2 = 4;				//num2라는 변수에 4라는 값을 부여
		int num3 = num1 + num2;		//num3은 num1 + num2 의 값이다.
		System.out.println(num3);	// 14
		
		

	}

}
		//Data(수,자료) : 선 저장 / 후 처리
		//변수 : 개발자의 유지보수 측면에서 바뀔 예정이 큰 수
		//변수명 : 저장되어져 있는 변수 공간에 접근하기 위한 문자 형태의 주소
		//자료형 : Data(수,자료)를 저장하기 위한 공간을 형성하는 예약어(+제약조건)
		//lv(공간) = rv(값)   rv를 먼저 처리(저장 or 연산) 한 다음 lv 에 대입 