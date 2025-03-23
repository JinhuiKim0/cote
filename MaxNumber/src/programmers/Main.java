package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine();
		String[] inp=input.trim().split(","); // 공백제거, ","기준으로 분리
		int[] numbers=new int[inp.length];
		for(int i=0;i<inp.length;i++) { // String->Integer 형변환
			numbers[i]=Integer.parseInt(inp[i]);
		}
		Solution solution=new Solution();
	}
}
