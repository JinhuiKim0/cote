package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine();
		Solution sol=new Solution();
		System.out.print(sol.solution(input));
	}

}
