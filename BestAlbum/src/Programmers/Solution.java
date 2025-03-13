package Programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] Solution(String[] genres, int[] plays) {
		int[] answer= {};
		Map<String, Integer> map=new HashMap<>();
		
		for(int i=0; i<plays.length;i++) {
			map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
		}
		
		return answer;
	}
}
