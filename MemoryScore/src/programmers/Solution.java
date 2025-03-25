package programmers;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer =new int[photo.length];
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<photo.length;i++) {
        	for(int j=0;j<name.length;j++) {
        		map.put(name[j], 0);
        	}
        	for(int j=0;j<photo[i].length;j++) {
        		map.put(photo[i][j], map.getOrDefault(photo[i][j],0)+1);
        	}
        	for(int j=0;j<photo[i].length;j++) {
        		answer[i]+=map.get(name[j])*yearning[j];
        	}
        }
        return answer;
    }
}