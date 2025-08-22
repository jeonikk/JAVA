package Ch01;

import java.util.Objects;

class C03Simple{
	int n;
	C03Simple(int n){
		this.n=n;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (obj instanceof C03Simple) {
			C03Simple down = (C03Simple)obj;
			return this.n == down.n;
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(this.n);	// 해쉬코드를 다른값으로 교체(ex 패스워드,메시지 암호화)
	}	
	
	
}

public class C03ObjectMain {

	public static void main(String[] args) {
		
		C03Simple ob1 = new C03Simple(10);
		System.out.println(ob1.toString());			//Ch01.C03Simple@5305068a
		System.out.printf("%x \n",ob1.hashCode());	//5305068a <--해쉬코드값 (객체의 위치정보)
		
		C03Simple ob2 = new C03Simple(9);
		System.out.println(ob2.toString());
		System.out.printf("%x \n",ob2.hashCode());
		
	}

}
