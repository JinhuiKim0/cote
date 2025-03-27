package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String[] input=reader.readLine().split(",");
		int[] progresses=new int[input.length];
		for(int i=0;i<input.length;i++) {
			progresses[i]=Integer.parseInt(input[i].trim());
		}
		String[] inp=reader.readLine().split(",");
		int[] speeds=new int[inp.length];
		for(int i=0;i<inp.length;i++) {
			speeds[i]=Integer.parseInt(inp[i].trim());
		}
		for(int i:progresses) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:speeds) {
			System.out.print(i+" ");
		}
		System.out.println();
		Solution sol=new Solution();
		int[] result=sol.solution(progresses, speeds);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" "); 
		}
	}
}
