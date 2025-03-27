package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine();
		int bridge_length=Integer.parseInt(input);
		input=reader.readLine();
		int weight=Integer.parseInt(input);
		String[] str=reader.readLine().split(",");
		int[] truck_weights=new int[str.length];
		for(int i=0;i<str.length;i++) {
			truck_weights[i]=Integer.parseInt(str[i]);
		}
		
		Solution sol=new Solution();
		System.out.print(sol.solution(bridge_length,weight,truck_weights));
	}
}
