package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		input = input.substring(1, input.length() - 1);

		String[] inputArray = input.split(","); // "," 제거
		int[] nums = new int[inputArray.length];
		for (int i = 0; i <inputArray.length; i++) {
			nums[i] = Integer.parseInt(inputArray[i]);
		}

		Solution solution = new Solution();
		System.out.println(solution.solution(nums));
	}

}

class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		Set<Integer> set1 = new HashSet<>();
		
		for (int num : nums) {
			set1.add(num);
		}
		
		int keyCount=set1.size();
		
		if ((nums.length / 2) > keyCount) {
			answer = keyCount;
		} else {
			answer = nums.length / 2;
		}
		return answer;
	}
}
