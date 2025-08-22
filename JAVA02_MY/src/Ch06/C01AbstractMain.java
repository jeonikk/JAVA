package Ch06;

//일반 클래스 상속관계

class Parent{
	void func() {}
	
}
class Son extends Parent{
	void func() {System.out.println("Son's func() call!");}
	
}

//추상 클래스 상속관계
//메서드 구현의 강제성을 부여한다
abstract class Parent2{		
	abstract void func(); 	//추상메서드(미완성된 함수, {} 가 없는)
	
}
class Son2 extends Parent2{

	@Override
	void func() {
		System.out.println("Son2's func() call!");
	}
	
}

public class C01AbstractMain {

	public static void main(String[] args) {
//		일반 클래스 상속관계
		Parent ob1 = new Parent();	//상위클래스형으로 객체 생성 o 
		Son ob2 = new Son();		//하위클래스형으로 객체 생성 o
		Parent ob3 = new Son();		//UPCASTING 연결 o 
		ob3.func();					//재정의된 func() 접근가능
		
		System.out.println("--------");
//		추상 클래스 상속관계 
//		Parent2 obj1 = new Parent2();//추상클래스로 객체 생성 x
		Son2 obj1 = new Son2();		//하위클래스형으로 객체 생성 o
		Parent2 obj3 = new Son2();	//UPCASTING 연결 o 
		obj3.func();				//재정의된 함수 접근 가능
		
	}
}
