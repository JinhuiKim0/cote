package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		System.out.println(s);// 확인용
		
		Solution sol=new Solution();
		System.out.println(sol.solution(s));
	}

}
