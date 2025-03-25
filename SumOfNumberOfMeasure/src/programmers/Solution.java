package programmers;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++) {
        	int number=0;
        	for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) { // j가 i의 약수인 경우
                    number++; // 약수 개수 증가
                    
                    // j와 i/j가 다르면 서로 다른 약수이므로 개수 2개 증가
                    if (j != i / j) {
                        number++;
                    }
                }
            }
        	if(number%2==0) {
        		answer+=i;
        	}else {
        		answer-=i;
        	}
        }
        return answer;
    }
}