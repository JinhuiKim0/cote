package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception{
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine();
		int k=Integer.parseInt(input);
		String[] inp= reader.readLine().trim().split(",");
		int[] score=new int[inp.length];
		for(int i=0;i<inp.length;i++) {
			score[i]=Integer.parseInt(inp[i].trim());
		}
		Solution sol=new Solution();
		int[] result=sol.solution(k, score);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
