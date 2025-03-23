package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().trim().split(","); // 공백제거 후 "," 기준으로 배열에 넣기
		int[] array = new int[input.length]; // String배열의 길이만큼 int배열 생성
		for (int i = 0; i < input.length; i++) {
			array[i] = Integer.parseInt(input[i].trim()); // String타입 int타입으로 변환
		}
		// [[1,2,3,],[4,5,6]] 이런형식으로 받을 예정 commends 2차원
		String inp = reader.readLine().trim().replaceAll("[\\[\\]]", ""); // 대괄호 제거
		String[] Inp = inp.split(",");
		int rowCount = Inp.length / 3; // 3개씩 묶어서 행 개수 결정
		int[][] commands = new int[rowCount][3];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < 3; j++) {
				// i=0일때는 0,1,2가 들어가게 됨.
				commands[i][j] = Integer.parseInt(Inp[i * 3 + j].trim()); // 행 단위로 저장
			}
		}
		// Solution 객체 호출
		Solution solution = new Solution();
		int[] re = solution.solution(array, commands);
		for (int i = 0; i < re.length; i++) {
			System.out.print(re[i] + " ");
		}
	}
}