package programmers;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int l=0;l<commands.length;l++) {
        	// int[] result=new int[array.length];
        	int i=commands[l][0]; // i번째부터
        	int j=commands[l][1]; // j번째까지
        	int[] num=new int[j-i+1]; // 자른 것을 저장하는 배열
        	int k=commands[l][2]; // 정렬한 것중에 k번째
        	int n=0; // num의 인덱스 증가 역할
        	// result=Arrays.copyOf(array,array.length);
        	for(int p=i-1;p<j;p++) { // i부터 j까지 복사
        		num[n]=array[p];
        		n++;
        	}
        	Arrays.sort(num); // 정렬
        	answer[l]=num[k-1];
        }
        return answer;
    }
}

