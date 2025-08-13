package Ch03;

public class C05TypeChange {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 4;
		double dnum1 = (double)num1 / num2;	//num1의 값을 double로 강제형변환 후  num2의 값을 나눈다 = 2.5
		double dnum2 = (num1*1.0) / num2;	// num1의 값을 1.0 곱하고 num2의 값을 나눈다 = 2.5
		double dnum3 = num1 / num2;			
		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);
		
	}

}
