package programmers;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++) {
        	int number=0;
        	for(int j=1;j<=Math.sqrt(i);j++) {
        		if(i%j==0) { // 약수
        			number++;
        		}
        	}
        	number=number*2;
        	if(Math.sqrt(i)*Math.sqrt(i)==i) {
        		number--;
        	}
        	if(number%2==0) {
        		answer+=number;
        	}else {
        		answer-=number;
        	}
        }
        return answer;
    }
}