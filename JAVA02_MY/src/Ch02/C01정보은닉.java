package Ch02;

//접근 한정자
//멤버/클래스의 접근범위를 제한을 위한 예약어
//purblic			: 모든 클래스에서 접근가능
//private			: 해당 클래스에서만 접근가능
//protected			: 상속 관계를 가지는 경우에 접근가능
//defualt(기본)		: 동일 패키지에 속한 클래스에서 접근가능

class C01Person
{
	String name;
	private int age; //private 를 사용함으로 데이터 정보를 숨김
	private String addr;
//	기능
	
//	setter 함수(기존데이터를 수정)
	public void setAge(int age) { // setter를 사용함으로 private하게 접근한다.
		this.age = age;
	}
	
//	getter 함수(데이터를 외부로 반환)
	public int getAge() {		// <-- 자주 쓰이는 형태
		return this.age;
	}
	
//	public String getAddr() { //우클릭 -> source -> generate getter and setter 클릭
//		return addr;
//	}
//	
//	public void setAddr(String addr) {
//		this.addr = addr;
//	}

	//	디폴트 생성자
	public C01Person() {}
	
//	모든인자 생성자
	public C01Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
//	void show() {
//		System.out.printf("이름 : %s\n나이 :%d\n주소 :%s",this.name,this.age,this.addr);
//		System.out.println("\n------------");
//	}
}

public class C01정보은닉 {

	public static void main(String[] args) {
		C01Person person1 = new C01Person("홍길동",55,"대구");
//		person1.show();
		person1.setAge(33); // setter를 사용함으로 private하게 접근한다.
		
		System.out.println(person1.getAge());
		
	}

}
