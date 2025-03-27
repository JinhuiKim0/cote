package programmers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();  // 며칠이 걸리는지를 저장
        int max = 0;  // 최대값
        int count = 0;  // 개수 계산

        // 며칠 걸리는지 계산
        for (int i = 0; i < progresses.length; i++) {
            int remains = 100 - progresses[i];  // 남은 진도
            int num = remains / speeds[i];
            if (remains % speeds[i] != 0) {  // 나머지가 있으면 하루 더 걸린다
                num++;
            }

            if (queue.isEmpty()) {  // queue가 비어있다면
                queue.add(num);
                max = num;  // 첫 번째 값으로 최대값을 설정
            } else {  // queue가 비어있지 않은 경우
                if (max >= num) {  // max보다 작거나 같으면
                    queue.add(max);  // max를 계속 넣음
                } else {  // max보다 더 크면 max를 갱신
                    max = num;
                    queue.add(max);
                }
            }
        }

        // 작업 갯수를 셈
        Map<Integer, Integer> map = new HashMap<>();  // 각 그룹별 개수를 셈
        while (!queue.isEmpty()) {
            int current = queue.poll();  // queue에서 값을 하나씩 꺼냄
            map.put(current, map.getOrDefault(current, 0) + 1);  // 같은 값의 개수 증가
        }

        // answer 배열 크기 계산
        int[] answer = new int[map.size()];
        int j = 0;

        // map에 있는 내용을 answer 배열에 담기
        for (int value : map.values()) {
            answer[j++] = value;
        }

        return answer;
    }
}



