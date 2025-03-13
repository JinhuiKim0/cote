package Programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		input = input.substring(1, input.length() - 1);

		String[] inputArray = input.split(","); // "," 제거
		String[] participant=new String[inputArray.length];
		input="";
		input=reader.readLine();
		input = input.substring(1, input.length() - 1);

		String[] inputArray1 = input.split(","); // "," 제거
		String[] completion=new String[inputArray1.length];
		
		Solution solution=new Solution();
		System.out.print(solution.solution(participant, completion));
	}
}
