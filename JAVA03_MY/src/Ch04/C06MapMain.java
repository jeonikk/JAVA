package Ch04;

import java.util.HashMap;
import java.util.Map;

public class C06MapMain {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap();
		
//		추가
		map.put("aaa", 1111);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);	//older 삭제
		map.put("ddd", 5555);	//newer 적용
		
//		확인
		for(String key : map.keySet()) { // 맵에서 모든 키를 가져온다["aaa","bbb","ccc","ddd"]
			System.out.println("KEY : "+key+"VALUE : "+map.get(key)); 	//get을 통해 key 밸류값을 가져옴
		}
		
//		삭제
		map.remove("aaa");
		
//		확인
		System.out.println("SIZE : " + map.size());
		System.out.println("단건 : "+ map.get("bbb"));
	}

}
