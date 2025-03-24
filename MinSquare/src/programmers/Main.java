package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		var reader=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=reader.readLine().replaceAll("[\\[\\]]", "").trim().split(",");
		int num=input.length/2; // 2개씩 짝짓기
		int[][] sizes=new int[num][2];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 2; j++) {
				// i=0일때는 0,1,2가 들어가게 됨.
				sizes[i][j] = Integer.parseInt(input[i * 2 + j].trim()); // 행 단위로 저장
			}
		}
		Solution sol=new Solution();
		System.out.print(sol.solution(sizes));
	}
}
