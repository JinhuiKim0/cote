package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * public class Main { public static void main(String[] args) throws Exception{
 * var reader=new BufferedReader(new InputStreamReader(System.in)); String[]
 * name = reader.readLine().trim().split(","); String[]
 * input=reader.readLine().trim().split(","); int[] yearning=new
 * int[input.length];
 * 
 * for(int i=0;i<yearning.length;i++) {
 * yearning[i]=Integer.parseInt(input[i].trim()); }
 * 
 * } }
 */
public class Main {
    public static void main(String[] args) {
        // 테스트 데이터 준비
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
            {"may", "kein", "kain", "radi"},
            {"may", "kein", "kain"},
            {"kain", "radi"},
            {"may", "kain", "radi"}
        };
        
        // Solution 객체 생성 후 solution 메서드 호출
        Solution solution = new Solution();
        int[] result = solution.solution(name, yearning, photo);

        // 결과 출력
        for (int score : result) {
            System.out.println(score);
        }
    }
}
