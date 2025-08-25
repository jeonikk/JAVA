package Ch03;

class 팝콘재료
{
	
}

class 캬라멜 extends 팝콘재료{

	@Override
	public String toString() {
		return "캬라멜";
	}
	
}

class 버터옥수수 extends 팝콘재료{

	@Override
	public String toString() {
		return "버터옥수수";
	}
	
}

//class 팝콘 <T extends 팝콘재료>{
//	private T 재료;
//	
//	public 팝콘 (T 재료) {
//		this.재료 = 재료;
//	}
//
//	@Override
//	public String toString() {
//		return "팝콘 [재료=" + 재료 + "]";
//	}
	
class 캬라멜팝콘<T extends 팝콘재료>{
	private T 재료;
	public 캬라멜팝콘(T 재료) {
		this.재료 = 재료;
	}
	
	@Override
	public String toString() {
		return "캬라멜팝콘 [재료=" + 재료 + "]";
	}
}

	class 버터팝콘<T extends 팝콘재료>{
		private T 재료;
		public 버터팝콘(T 재료) {
			this.재료 = 재료;
		}
		@Override
		public String toString() {
			return "버터팝콘 [재료=" + 재료 + "]";
		}
		
		
}

public class C02Ex {

	public static void main(String[] args) {
		캬라멜팝콘<캬라멜> ob1 = new 캬라멜팝콘<캬라멜>(new 캬라멜());
		System.out.println(ob1);

		버터팝콘<버터옥수수> ob2 = new 버터팝콘<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);
	}

}


