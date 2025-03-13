package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		int N= 100000;
		String input = reader.readLine();
		input = input.substring(1, input.length() - 1);

		String[] inputArray = input.split(","); // "," 제거
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(inputArray[i]);
		}

		Solution solution = new Solution();
		System.out.println(solution.solution(nums));
	}

}

class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		int N = nums.length;
		Map<Integer, Integer> map1 = new HashMap<>();
		for (int num : nums) {
			map1.put(num, map1.getOrDefault(num, 0) + 1);
		}

		int keyCount = map1.keySet().size();

		if ((N / 2) > keyCount) {
			answer = keyCount;
		} else {
			answer = N / 2;
		}
		return answer;
	}
}
