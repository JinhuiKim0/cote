package programmers;

import java.util.List;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str={};
        List<String> st= new List<String>();

        for(int i=0;i<numbers.length;i++){
            str[i]=numbers[i]+""; // 문자열 배열로 변환
        }
        // a+b>b+a?a+b:b+a사용하고 싶음
        for(int i=0;i<str.length;i++) {
        	for(int j=1;j<str.length;j++) {
        		// 여기부터 list를 사용해서 비교해서 더 큰게 앞으로? 모르겠다.
        	}
        }
        
        return answer;
    }
}