package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine(); 
        input = input.trim(); // 공백 제거
        input = input.substring(1, input.length() - 1); // 양쪽 대괄호 제거
        String[] rows = input.split("\\], \\[");  // 각 항목을 분리 ("] ["를 기준으로 분리)

        // 2차원 배열 생성
        String[][] clothes = new String[rows.length][2];  // 예시에서 각 내부 배열은 두 개의 요소를 가짐

        for (int i = 0; i < rows.length; i++) {
            String[] elements = rows[i].split(", "); // 항목을 쉼표로 분리
            clothes[i][0] = elements[0].replace("\"", "");  // 첫 번째 요소 
            clothes[i][1] = elements[1].replace("\"", "");  // 두 번째 요소 
        }
        Solution solution = new Solution();
		System.out.println(solution.solution(clothes));
	}
}
