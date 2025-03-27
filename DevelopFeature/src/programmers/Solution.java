package programmers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution {
	public int[] solution(int[] progresses,int[] speeds) {
		// 선입선출 필요
		Queue<Integer> queue=new LinkedList<>(); // 며칠이 걸리는 지를 저장.
		int max=0; // 최대값
		int count=0; // 개수 계산
		// 며칠 걸리는지 계산
		for(int i=0;i<progresses.length;i++) {
			int remains=100-progresses[i]; // 남은 진도.
			int num=remains/speeds[i]; 
			if(queue.isEmpty()) { // queue가 비어있다면
				if(remains%speeds[i]==0) { // 딱 맞아 떨어지면
				queue.add(num);
				max=num; // 최대값을 num으로 저장. queue가 비어있는 상태이기 떄문
				}else { // 딱 맞아떨어지지 않는경우
					queue.add(num+1);
					max=num+1;// 최대값을 num+1로 저장. queue가 비어있는 상태이기 떄문
				}
			}else { // queue가 비어있지 않은 경우
				if(remains%speeds[i]==0) { // 딱 맞아 떨어지면
					if(max>=num) { // 최대값보다 num이 작으면
						queue.add(max); // max를 대신 넣음.
					}else { // 최대값보다 큰경우
						max=num;
						queue.add(max);
					}
				}else { // 딱 맞아떨어지지 않는경우
					if(max>=num+1) { // 최대값보다 num이 작으면
						queue.add(max); // max를 대신 넣음.
					}else { // 최대값보다 큰경우
						max=num+1;
						queue.add(max);
					}
				}
			}
		}
		// queue내부에 중복되게 작성해놓았으니 갯수 계산
		// 앞의 Integer은 순서를 얘기해줌. 뒤의 Integer은 GetOfDefault을 1로 하여 기본은 1이고 중복되어나오면 수가 증가
		Map<Integer,Integer> map=new HashMap<>(); 
		for(int i=1;i<=queue.size();i++) {
			map.put(queue.remove(), map.getOrDefault(queue.remove(), 0)+1);
		}
		int[] answer=new int[map.size()];
		int j=0;
		// map을 순회하여 answer배열에 담기
		for(int k:map.keySet()) {
			answer[j]=k;
			j++;
		}
		return answer;
	}
}


