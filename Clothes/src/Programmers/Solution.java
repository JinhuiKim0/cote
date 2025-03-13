package Programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
	public int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map1 = new HashMap<>();
		
		for(int i=0;i<clothes.length;i++) {
			String name=clothes[i][1];
			map1.put(name, map1.getOrDefault(name, 0) + 1);
		}
		// map1의 value값들을 순회하게 함
		Iterator<Integer> iter=map1.values().iterator();
		while(iter.hasNext()) { // 다음 값이 없을때까지 루프
			int data=iter.next();
			answer*=(data+1);
		}
		// 옷을 하나도 안 입은 경우 제외
		return answer-1;
	}
}
