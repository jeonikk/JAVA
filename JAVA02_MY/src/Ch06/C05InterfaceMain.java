package Ch06;

interface A{
	void ab();
}
interface B{
	void ab();
}
class C{
	
}
class D{
	
}
class E extends C implements A,B //extends 는 implements 앞에 위치
{

	@Override
	public void ab() {
		System.out.println("ABAB");
	}
	
}
public class C05InterfaceMain {

	public static void main(String[] args) {
			E ob = new E ();
			ob.ab();
		
	}

}
