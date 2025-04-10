package programmers;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:scoville) {
        	pq.add(i);
        }
        while(pq.size()>1 && pq.peek()<K) {
        	int first=pq.poll();
        	int second=pq.poll();
        	int sum=first+(second*2);
        	pq.add(sum);
        	answer++;
        }
        return (pq.peek()>=K)?answer:-1;
    }
}