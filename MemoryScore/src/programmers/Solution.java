package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 이름과 점수를 매핑할 HashMap 생성
        Map<String, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        // 결과를 담을 배열
        int[] answer = new int[photo.length];
        
        // 각 사진에 대해 점수 합산
        for (int i = 0; i < photo.length; i++) {
            int totalScore = 0;
            for (String person : photo[i]) {
                totalScore += scoreMap.getOrDefault(person, 0); // person에 해당하는 점수 합산, 없으면 0
            }
            answer[i] = totalScore; // 해당 사진의 점수 기록
        }
        
        return answer;
    }
}
