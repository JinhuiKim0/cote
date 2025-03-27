package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 결과를 담을 List
        List<Integer> result = new ArrayList<>();
        
        // 각 기능이 완성되는 날짜 계산
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remainingProgress = 100 - progresses[i];  // 남은 진도
            int days = remainingProgress / speeds[i];
            if (remainingProgress % speeds[i] != 0) {
                days++;  // 나머지가 있으면 하루 더 추가
            }
            queue.add(days);  // 각 기능이 완성되는 날짜 추가
        }
        
        // 배포된 기능들의 개수를 셈
        int count = 1;  // 첫 번째 기능은 최소 1개
        int maxDay = queue.poll();  // 첫 번째 기능의 완성 날짜를 가져옴
        
        while (!queue.isEmpty()) {
            int nextDay = queue.poll();  // 다음 기능의 완성 날짜
            
            if (nextDay <= maxDay) {  // 만약 현재 배포된 기능보다 더 빨리 완성되면 함께 배포
                count++;
            } else {  // 만약 더 늦게 완성되면 새로운 배포가 시작
                result.add(count);  // 이전 배포의 개수를 기록
                count = 1;  // 새 배포는 하나부터 시작
                maxDay = nextDay;  // 새로운 배포 기준일 설정
            }
        }
        
        result.add(count);  // 마지막 배포도 추가
        
        // List를 int[]로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);  // List에서 값을 꺼내서 배열에 넣기
        }

        return answer;
    }
}
