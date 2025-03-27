package programmers;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<String> stack=new ArrayDeque<>(); // 괄호를 넣을 stack
        String[] str=s.split(""); // 각각 문자열 분리
        for(int i=0;i<str.length;i++) {
        	if(str[i].equals("(")) {
        		stack.push("(");
        	}else if(str[i].equals(")")) {
        		String sr=stack.pop();
        		if(sr.equals("(")) {
        			answer=true;
        		}else {
        			answer=false;
        		}
        	}
        }
        return answer;
    }
}
