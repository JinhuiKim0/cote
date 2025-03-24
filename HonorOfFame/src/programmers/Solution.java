package programmers;
// 2025.03.23 작성
//점수부여
//지금까지 출연가수 점수들중 k번째 이내이면 명예의 전당 목록
//초기 k일가지는 모두 명예전당
//k=순위, score 사람들의 점수
//순위보다 1개 더 넣고 sort하고 마지막에 저장하고 sort하고 이런식으로 할예정
import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];  // 결과를 저장할 배열
        // 우선순위 큐(최소 힙)를 사용하여 상위 k개의 점수만 유지
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);  // 새로운 점수를 큐에 추가
            
            if (pq.size() > k) {  // 큐의 크기가 k보다 크면, 가장 작은 값을 제거
                pq.poll();
            }
            
            // 큐의 크기가 k 미만일 때는 아직 k번째 순위가 없으므로, 가장 큰 값으로 채운다.
            if (pq.size() < k) {
                answer[i] = Collections.max(pq);  // 최대값을 넣는다
            } else {
                // 큐의 가장 작은 값이 k번째 순위
                answer[i] = pq.peek();  // PriorityQueue의 맨 앞이 k번째 순위
            }
        }
        return answer;
    }
}