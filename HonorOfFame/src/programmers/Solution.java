package programmers;
// 2025.03.23 작성
//점수부여
//지금까지 출연가수 점수들중 k번째 이내이면 명예의 전당 목록
//초기 k일가지는 모두 명예전당
//k=순위, score 사람들의 점수
//순위보다 1개 더 넣고 sort하고 마지막에 저장하고 sort하고 이런식으로 할예정
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[k];  // 명예의 전당 배열 (상위 k개의 점수를 저장)
        int[] answer = new int[score.length];  // 각 시점에서의 k번째 점수 기록
        
        // 첫 번째 점수는 바로 result에 저장
        result[0] = score[0];
        answer[0] = score[0];

        for (int i = 1; i < score.length; i++) {
            if (i < k) {
                // k보다 적을 때는 바로 저장
                result[i] = score[i];
                Arrays.sort(result, 0, i + 1, Collections.reverseOrder());
                answer[i] = result[i];
            } else {
                // k번째 점수를 구하기 위해 마지막 자리에 새로운 점수 넣고 정렬
                result[k - 1] = score[i];
                Arrays.sort(result, 0, k, Collections.reverseOrder());
                answer[i] = result[k - 1];
            }
        }
        
        return answer;
    }
}