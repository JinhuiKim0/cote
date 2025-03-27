package programmers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        List<Integer> answer =new LinkedList<>();
        Deque<Integer> queue=new ArrayDeque<>(); // 개발 날짜
        int num=0;
        for(int i=0;i<progresses.length;i++) { // 각자 개발 날짜 입력
        	num=100-progresses[i];
        	if(num%speeds[i]==0) {
        		queue.addLast(num/speeds[i]);
        	}else { // 나눴을때 나누어떨어지지 않으면 +1을 해줘야함.
        		queue.addLast((num/speeds[i])+1);
        	}
        }
        int Max=queue.remove(); // 일단 제일 처음 값을 제일 큰 값으로 넣기
        for(int i=1;i<queue.size();i++) {
        	int count=1; // 기본적으로 본인을 포함해야하기때문에
        	int number=queue.remove(); // 다음값
        	if(Max>=number) { // Max보다 작거나 같은 경우
        		count++;
        	}else { // Max보다 큰 경우
        		Max=number;
        		answer.addLast(count);
        	}
        }
        return answer;
    }
}
