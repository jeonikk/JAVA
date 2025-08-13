package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
//		00 기본 문법
		
//		while(조건식) {
//			조건식이 true 인 동안 실행되는 종속문자
//		}
		
//		01 HELLO WORLD 10회 출력
		
//		while(true) 
//			System.out.println("HELLO WORLD"); //무한반복
		
//		탈출용 변수	: i
//		탈출용 조건식	: i<10
//		탈출 연산식	: i++
		
//		int i =0;
//		while (i<10) {
//			System.out.println(i+" HELLO WORLD");
//			i++;
//		}
		
//		02 HELLO WORLD N 회 출력(N 은 키보드로 받는 정수값,N>0)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if (n<=0) {
//			System.out.printf("n은 0보다 커야합니다.\n");
//			System.exit(-1);
//		}
//		
//		int i=0;
//		while(i<n) {
//			System.out.println(i+" HELLO WORLD");
//			i++;
//		}
		
//		03 1부터 10까지 누적합 구하기
		
//		int i=1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("i : "+ i);
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지의 합 : %d\n", 1,10,sum);
		
//		04 1부터 n까지 누적합 구하기
//		Scanner sc = new Scanner(System.in);
//		int i=1;
//		int sum =0;
//		int n = sc.nextInt();
//		while(i<=n) {
//			System.out.println("i : "+ i);
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지의 합 : %d\n", 1,n,sum);
		
//		05 n부터 m까지 누적합 구하기(n<m)
//		Scanner sc = new Scanner(System.in);
//		
//		int n= sc.nextInt();
//		int m= sc.nextInt();
//		
//		if(n>=m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		int i =n;
//		int sum = 0;
//		while(i<=m)
//		{
//			System.out.println(" i : "+ i);
//			sum +=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지의 합 : %d\n", n,m,sum);
		
//		06 N - M까지 수중(N<M) 짝수의합, 홀수의 합을 각각 구해서 출력하세요
//		Scanner sc = new Scanner(System.in);
//		System.out.println("값을 입력하세요 : ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		
//		int i=n,num1=0,num2=0;
//		while (i<=m) {
//			if(i%2==0)
//				num1 = num1 + i;
//			else
//				num2 += i;
//			i++;
//		}
//		System.out.println("짝수의 합 : "+num1);
//		System.out.println("홀수의 합 : "+num2);
		
//		07 n단 구구단 출력 (2<= n <=9)
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : " );
		int n = sc.nextInt();
		
//		유효성 확인(n<2||n>9)
		while(n<2||n>9) {
			System.out.println("2<= n <=9 값을 입력하세요 !");
			n = sc.nextInt();
		}
		
		int i=1;
		while(i<10) {
			System.out.printf("%d x %d = %d\n",n,i,n*i);
			i++;
		}
	}

}
