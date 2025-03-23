package programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n=citations.length;
        int[] result= new int[n];
        for(int i=0;i<n;i++) {
        	result[i]=Math.min(citations[i], i+1);
        }
        Arrays.sort(result); // 오름차순 정렬
        answer=result[n-1]; // 제일 마지막 인덱스 배열의 값
        return answer;
    }
}