package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		var reader = new BufferedReader(new InputStreamReader(System.in));

		String input = reader.readLine();
		input = input.substring(1, input.length() - 1); // 괄호 제거

		String[] inputArray = input.split(","); // ","로 분리
		String[] phone_book = new String[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			phone_book[i] = inputArray[i].trim().replace("\"", ""); // 공백과 따옴표 제거
		}
		// Solution 클래스 사용
		Solution solution = new Solution();
		System.out.println(solution.solution(phone_book));
	}
}
