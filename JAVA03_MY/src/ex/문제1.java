package ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 문제1 {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<String> wordList =new ArrayList<String>();
	
	public static void sort(boolean isAsend) { //sort 정렬하다
		if (isAsend) {
			Collections.sort(wordList);
			System.out.println("오름차순으로 정렬");
		}else {
			Collections.sort(wordList,Collections.reverseOrder());
			System.out.println("내림차순으로 정렬");
		}
	}
	
	public static void add (String word) { //contains 이미 존재하는지 여부
		if (wordList.contains(word)) {
			System.out.println(word + "은(는) 이미 존재합니다.");
		}else  {
			wordList.add(word);
			System.out.println(word + "\t 추가 완료!");
		}
	}
	
	public static void show () { // isEmpty 비어있다
		if (wordList.isEmpty()) {
			System.out.println("목록이 비어있습니다.");
		}else {
			System.out.println("------목록 확인------");
			for (String word : wordList) {
				System.out.printf("\t %s\n",word);
			}
			System.out.println("------------------");
		}

	}
	
	public static void main(String[] args) {
		int n = 0;
		while (true) {
			System.out.println("------------M E N U------------");
			System.out.println("1 추가");
			System.out.println("2 정렬");
			System.out.println("3 확인");
			System.out.println("4 종료");
			System.out.println("------------M E N U------------");
			System.out.println("번호 : ");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("단어 입력 : ");
				String word = sc.next();
				add(word);
				break;
			case 2:
				System.out.print("오름차순 여부(1:오름차순,0:내림차순) : ");
				int no = sc.nextInt();
				if(no==1) sort(true); else sort(false);
				
				break;
			case 3:
				show();
				break;
			case 4:
				System.out.println("종료합니다.");
				System.exit(-1);
				break;
			default:
				System.out.println("다시입력 하세요");
			}
		}
	}
	
}
