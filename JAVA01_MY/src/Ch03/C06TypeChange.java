package Ch03;

public class C06TypeChange {

	public static void main(String[] args) {
		
		//short vs char
		//char 와 short는 같은 size(2byte)를 가지나
		//short는 양,음수를 지원 / char는 양수만 지원
		//short char간의 데이터교환시 동일한 값을 저장하더라도
		//표현하는 범위가 다르기 때문에 각각 다른값이 나올수도 있다.
		
		char n1 = 60000; //11101010 01100000 
		short n2 = (short)n1;//11101010 01100000 맨앞비트가 1이므로 음수로 해석. 
//		원래 비트: 11101010 01100000
//		비트 반전: 00010101 10011111
//		+ 1       : 00010101 10100000  (10진수 5536) -> 음수해석 하면 -5536
		System.out.println(n2);
		
		int n3 = (char)n2;
		System.out.println(n3);

	}

}
