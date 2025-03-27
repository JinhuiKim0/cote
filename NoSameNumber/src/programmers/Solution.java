package programmers;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Deque<Integer> queue=new ArrayDeque<>();
        queue.add(arr[0]); // 첫째 배열은 일단 입력
        for(int i=1;i<arr.length;i++) {
        	if(arr[i-1] != arr[i]) {
        		queue.addLast(arr[i]);
        	}
        }
        int[] answer =new int[queue.size()]; // queue의 사이즈만큼 배열 생성
        for(int i=0;i<answer.length;i++) {
        	answer[i]=queue.removeFirst();
        }

        return answer;
    }
}