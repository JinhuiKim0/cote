package programmers;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:scoville) {
        	pq.add(i);
        }
        for(int i=0;i<scoville.length;i++) {
        	if(pq.peek()>=K) { // 최소힙이 K와 같으면 중단.
        		break;
        	}else { // K보다 작은경우
        		int first=pq.poll();
        		int second=pq.poll();
        		pq.add(first+(second*2));
        		answer++;
        	}
        }
        if(answer==0) {
        	return -1;
        }
        return answer;
    }
}