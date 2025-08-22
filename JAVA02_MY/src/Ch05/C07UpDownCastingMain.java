package Ch05;

class A{
	int a;

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
}
class B extends A{
	int b;

	@Override
	public String toString() {
		return "B [b=" + b + ", a=" + a + "]";
	}
	
}
class C extends A{
	int c;

	@Override
	public String toString() {
		return "C [c=" + c + ", a=" + a + "]";
	}

}
class D extends B{
	int d;

	@Override
	public String toString() {
		return "D [d=" + d + ", b=" + b + ", a=" + a + "]";
	}

}
class E extends B{
	int e;

	@Override
	public String toString() {
		return "E [e=" + e + ", b=" + b + ", a=" + a + "]";
	}
	
}
class F extends C{
	int f;

	@Override
	public String toString() {
		return "F [f=" + f + ", c=" + c + ", a=" + a + "]";
	}

}
class G extends C{
	int g;

	@Override
	public String toString() {
		return "G [g=" + g + ", c=" + c + ", a=" + a + "]";
	}

}

public class C07UpDownCastingMain {

	public static void UpDownCastTestFunc(A obj) //Upcasting
	{									//A obj = new A(); // NoCasting
										//A obj = new B(); // UpCasting
										//A obj = new C(); // UpCasting
		obj.a=100;
		
		if(obj instanceof B) {
			B down = (B)obj;
			down.b=200;
		}
		
		if(obj instanceof C) {
			C down = (C)obj;
			down.c=300;
		}
		if(obj instanceof D) {
			D down = (D)obj;
			down.d=400;
		}
		if (obj instanceof E) {
			E down = (E)obj;
			down.e=500;
		}
		if (obj instanceof F) {
			F down = (F)obj;
			down.f=600;
		}
		if(obj instanceof G) {
			G down =(G)obj;
			down.g=700;
		}
		
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		UpDownCastTestFunc(new A());
		UpDownCastTestFunc(new B());
		UpDownCastTestFunc(new C());
		UpDownCastTestFunc(new D());
		UpDownCastTestFunc(new E());
		UpDownCastTestFunc(new F());
		UpDownCastTestFunc(new G());

	}

}
