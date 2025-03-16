package B0J11478;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine(); 
		Solution solution=new Solution();
		System.out.print(solution.solution(input));
	}
}
class Solution {
	public int solution(String s) {
		int answer=0;
		Set<String> set= new HashSet<>();
		for(int i=1;i<s.length();i++) {
			set.add(s.substring(0,i));
		}
		answer=set.size();
		return answer;
	}
}
