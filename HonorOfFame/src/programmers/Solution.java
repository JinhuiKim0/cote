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
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // 최소 힙을 이용하여 상위 k개의 점수 추적
        
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);  // 새로운 점수를 추가
            
            // 힙의 크기가 k보다 커지면, 가장 작은 점수를 제거
            if (pq.size() > k) {
                pq.poll();
            }
            
            // k개 이하일 때는 최소 힙의 가장 작은 값이 k번째 큰 점수
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}