package Ch04;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04Ex {

	public static void main(String[] args) throws InterruptedException {
//		1) 1~45까지 숫자를 6개를 랜덤으로 받아(Random 클래스를 이용) set 에 저장/출력
		
		System.out.println("-------랜덤배치-------\n");
		Set<Integer> set = new HashSet();
		Random rnd = new Random();
		while(set.size()<6){ //	set.size 저장공간 
			set.add(rnd.nextInt(45)+1);
		}
		for(Integer el : set){
			System.out.print(el+" ");
//			Thread.sleep(500);
		}
		System.out.println("\n-------오름차순-------\n");
//		2) [추가]저장된 set 의 오름차순정렬을 해보세요(검색을 통해서 해결해봅니다 - 스트림함수사용)
		
		List<Integer> num = set.stream().sorted().collect(Collectors.toList());
		for(Integer el : num){
			System.out.print(el+" ");
		}
		
	}

}
