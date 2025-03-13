package Programmers;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map1 = new HashMap<>();

		for (String name : participant) {
			map1.put(name, map1.getOrDefault(name, 0) + 1);
		}
		for (String name : completion) {
			map1.put(name, map1.get(name) - 1);
		}
		for (String name : map1.keySet()) {
			if (map1.get(name) > 0) {
				answer = name;
			}
		}
		return answer;
	}
}