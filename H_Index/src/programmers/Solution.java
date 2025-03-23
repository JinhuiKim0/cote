package programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); // 오름차순 정렬
        int n=citations.length;
        
        for(int i=0;i<n;i++) {// 내림차순으로 정렬하지 않고 반대로 루프
        	//System.out.print(citations[i]);
        	int remain=i+1;// 현재 남은 논문의 개수
        	if(remain<=citations[i]) {
        		answer=remain;
        	}
        }
        return answer;
    }
}