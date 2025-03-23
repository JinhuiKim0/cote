package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine().trim();
		String[] str=input.split(",");
		int[] citations=new int[str.length];
		for(int i=0;i<str.length;i++) {
			citations[i]=Integer.parseInt(str[i].trim()); // String ->Integer 형변환
			System.out.print(citations[i]);
		}
		System.out.println();
		Solution solution=new Solution();
		System.out.print(solution.solution(citations));
	}
}
