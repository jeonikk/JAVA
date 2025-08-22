package Ch05;

class Parent{
	void func1() {System.out.println("Parent's func1() call!");}
	void func2() {}
//	void func2() {System.out.println("Parent's func1() call!");}//확장(추가된 함수)
	
}
class Son extends Parent{
	void func2() {System.out.println("Son's func2() call!");} //재정의
	
}


public class C08UpDownCastingMain {

	public static void main(String[] args) {
//		NoCasting
		Parent ob1 = new Parent();
		ob1.func1();
		System.out.println("-------");
		
//		NoCasting
		Son ob2 = new Son();
		ob1.func1();
		ob2.func2();
		System.out.println("-------");
		
//		UpCasting
		Parent ob3 = new Son();
		ob3.func1();
		ob3.func2();
		
//		UpCasting 된 상태에서
//		확장된(멤버추가) 멤버변수 접근 가능한가?	x -> DownCasting해야 가능
//		확장된(멤버추가) 멤버함수 접근 가능한가?	x -> DownCasting해야 가능
//		재정의된 멤버함수 접근 가능한가?			o 
		
	}
}
