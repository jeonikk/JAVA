package Ch01;

class A{
	
	int x;
	int y;
	
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}

}

public class C01ObjectMain {

	public static void main(String[] args) {
	
		A ob1 = new A();
//		ob1.equals(ob1);		// 객체끼리 일치하는지 비교 (반환자료형 : boolean)
//		ob1.getClass();
//		ob1.toString();			//오브젝트로 부터 물려받은것을 재정의
		
		
		System.out.println(ob1);
		System.out.println(ob1.toString());
		
		Object ob2 = new Object();
		System.out.println(ob2);
		System.out.println(ob2.toString());
	}

}
