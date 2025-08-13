package Ch06;

import java.util.Scanner;

public class C02SWITCH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("등수를 입력해주세요 : ");
		int ranking = sc.nextInt();
		String medalcolor;
		switch (ranking) {
		case 1:
			medalcolor = "Gold";
			System.out.println("메달 : Gold");
			break;
		case 2:
			medalcolor = "Silver";
			System.out.println("메달 : Silver");
			break;
		case 3:
			medalcolor = "Bronze";
			System.out.println("메달 : Bronze");
			break;
		default:
			medalcolor = "C";
			System.out.println("메달 : 참가상");	
		}
		System.out.println(ranking +"등 메달은"+medalcolor + "입니다.");
			

	}

}
