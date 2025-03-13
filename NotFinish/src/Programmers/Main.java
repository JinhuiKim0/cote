package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 입력 (참가자 배열)
        String input = reader.readLine();
        input = input.substring(1, input.length() - 1);  // 괄호 제거

        String[] inputArray = input.split(",");  // ","로 분리
        String[] participant = new String[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            participant[i] = inputArray[i].trim().replace("\"", "");  // 공백과 따옴표 제거
        }

        // 두 번째 입력 (완료자 배열)
        input = reader.readLine();
        input = input.substring(1, input.length() - 1);  // 괄호 제거

        String[] inputArray1 = input.split(",");  // ","로 분리
        String[] completion = new String[inputArray1.length];
        for (int i = 0; i < inputArray1.length; i++) {
            completion[i] = inputArray1[i].trim().replace("\"", "");  // 공백과 따옴표 제거
        }

        // Solution 클래스 사용
        Solution solution = new Solution();
        System.out.println(solution.solution(participant, completion));
    }
}