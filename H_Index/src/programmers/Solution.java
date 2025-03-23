package programmers;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        Integer[] sortedCitations = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedCitations, Collections.reverseOrder()); // 내림차순 정렬
        
        int answer = 0;
        
        for (int i = 0; i < sortedCitations.length; i++) {
            if (sortedCitations[i] >= i + 1) {// i+1편 이상 인용된 논문의 개수를 체크,그중 가장큰값.
                answer = i + 1;
            } else {
                break;
            }
        }
        
        return answer;
    }
}