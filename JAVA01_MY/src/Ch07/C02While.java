package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
////		2단 - 9단 출력
//		
//		int dan = 2;
//		while(dan<10) {
////			System.out.printf("%d\n",dan);
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println("------------------");
//			dan++;
//		}

//		2단 - 9단 (2x9 , 2x8, 2x7 .... 9x9 ..9x1)
//		int dan = 2;
//		while(dan<10) {
//			int i = 9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			dan++;
//		}
//		9단 - 2단 (9x9 , 9x8, 9x7 .... 2x9 ..2x1)
//		int dan = 9;
//		while(dan>1) {
//			int i = 9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
//		2단 - n단 (n>2)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("단 수를 입력해주세요 : ");
//		int n = sc.nextInt();
//		int dan = 2;
//		while(dan<=n) {
//			int i =1;
//			while(i<10) {
//			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//			i++;
//		}
//		dan++;
//	}
			
			
		
//		n단 - m단 (n<m)
		
//	Scanner sc = new Scanner(System.in);
//	System.out.println("단 수를 입력해주세요 : ");
//	int n = sc.nextInt();
//	int m = sc.nextInt();
//	int dan = n;
//	while(dan<=m) {
//		int i =1;
//		while(i<10) {
//		System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//		i++;
//	}
//	dan++;
//}
		
	//별찍기(기본높이:4)
	//반드시 반복을 사용할것, 반복시마다 하나의 * 만 찍어낼 것	
	//*****
	//*****
	//*****
	//*****
		
//		int i = 0;
//		while (i<4) {
//			int j = 0;
//			while (j<5) {
//				System.out.print("*");
//				j++;
//				
//			}
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("*의 갯수를 입력해주세요 : ");
//		int h =sc.nextInt();
//		
//		int i =0;
//		while (i<h) {
//			int j =0;
//			while (j<10) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		

		//   *
		//  ***
		// *****
		//*******
		
//		i(행)		j(공백)		k(별)
//		0		0-2		0-0		
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		---------------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<4		j<3-i		k<=2*i
		
		
		
		
//			int i =0;
//			while (i<4) {
//				int j=0;
//				while(j<3-i){
//					System.out.print(" ");
//					j++;
//				}
//				int k =0;
//				while (k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//				System.out.println(" ");
//				i++;
//			}
				
			// 높이: h
			//   *
			//  ***
			// *****
			//*******
			
//			i(행)		j(공백)		k(별)
//			0		0-(h-2)-0	0-0		
//			1		0-(h-2)-1	0-2
//			2		0-(h-2)-2	0-4
//			3		x		0-6
//			..
//			(h-1)
//			---------------------------------------
//			i=0		j=0		k=0
//			i++		j++		k++
//			i<h		j<(h-1)-i	k<=2*i
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("*을 입력해주세요 : ");
//		int h = sc.nextInt();
//		
//		int i=0;
//		while (i<h) {
//			int j=0;
//			while (j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//				int k=0;
//				while (k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//				System.out.println(" ");
//				i++;
//			}
		
//		i(행)		j(공백)		k(별)
//		0		x		0-6
//		1		0-0		0-4
//		2		0-1		0-2
//		3		0-2		0-0
//		-----------------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<4		j<i		k<=6 - 2*i
	
		
		//*******
		// *****
		//  ***
		//   *
		
//		int i =0;
//		while (i<4) {
//			int j =0;
//			while (j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k =0;
//			while (k<=6-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//높이 : h
		//*******
		// *****
		//  ***
		//   *

//		높이 :h
//		i(행)		j(공백)		k(별)
//		0		x		0-6
//		1		0-0		0-4
//		2		0-1		0-2
//		3		0-2		0-0
//		..
//		h-1
//		-----------------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<h		j<i		k<=((h-1)*2) - 2*i
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("*의 높이를 입력해주세요 : ");
//		
//		int h = sc.nextInt();
//		
//		int i =0;
//		while (i<h) {
//			int j = 0;
//			while (j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k =0;
//			while (k<=((h-1)*2)-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//   *
		//  ***
		// *****		
		//*******
		// *****
		//  ***
		//   *
//		i(행)		j(공백)		k(별)
//		0		0-2		0-0
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		-----------------------------------------
//		i<4		j=0		k=0
//				j++		k++
//				j<3-i		k<=2*i
//
//		4		0-0		0-4
//		5		0-1		0-2
//		6		0-2		0-0
//		-----------------------------------------
//		i>=4		j=0		k=0
//					j++			k++
//					j<=i-4		k<= 12-2*i
//
//		i=0
//		i++
//		i<7
		
		
//		int i=0;
//		int j =0;
//		int k =0;
//		
//		while (i<4) {
//			j=0;
//			while (j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			k=0;
//			while (k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		
//		i=0;
//		while (i<3) {
//			j=0;
//			while (j<i+1) {
//				System.out.print(" ");
//				j++;
//			}
//			k=0;
//			while (k<5-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		i(행)		j(공백)		k(별)
//		0		0-2				0-0
//		1		0-1				0-2
//		2		0-0				0-4
//		3		x				0-6
//		-----------------------------------------
//		i<=(h/2)	j=0			k=0
//					j++			k++
//					j<(h/2)-i	k<=2*i
//
//		4			0-0				0-4
//		5			0-1				0-2
//		6			0-2				0-0
//		-----------------------------------------
//					j=0				k=0
//					j++				k++
//					j<=i-(h/2+1)	k<=((h-1)*2)-2*i
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력 해주세요 : ");
//		int h = sc.nextInt();
//		
//		int i=0;
//		int j=0;
//		int k=0;
//		
//		i=0;
//		while(i<h){ //ex) 5입력시 h/2= 2 --> 3행 , 6 or 7입력시 4행
//			
//			if(i<=(h/2)) {
//			j=0;
//			while(j<(h/2)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//		
//			}else{
//
//			j=0;
//			while(j<=i-(h/2+1)) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			k=0;
//			while (k<=((h-1)*2)-2*i) {
//				System.out.print("*");
//				k++;
//			}
//		}
//			System.out.println();
//			i++;
//		}
		
		//*******
		// *****
		//  ***
		//   *		
		//   *
		//  ***
		// *****		
		//*******
		
		
		int i=0;
		while(i<7) {
			
			if(i<4) {
				//공백
				int j=0;
				while(j<i) {
					System.out.print(" ");
					j++;
				}
				//별
				int k=0;
				while(k<=6-2*i) {
					System.out.print("*");
					k++;
				}				
			}else {
				//공백
				int j=0;
				while(j<6-i) {
					System.out.print(" ");
					j++;
				}
				//별
				int k=0;
				while(k<=2*i-6) {
					System.out.print("*");
					k++;
				}	
			}
			
			System.out.println();
			i++;
		}
		
	}
}










