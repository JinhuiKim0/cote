package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine(); 
		int n=Integer.parseInt(input); // n값
		input=reader.readLine();
		String[] str=input.trim().split(","); // arr1
		
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i]=Integer.parseInt(str[i].trim());
		}
		
		input=reader.readLine();
		str=input.trim().split(","); // arr2
		
		for(int i=0;i<n;i++) {
			arr1[2]=Integer.parseInt(str[i].trim());
		}
		Solution solution=new Solution();
		String[] st = solution.solution(n, arr1, arr2);
		for(String stt:st) {
			System.out.print(stt+" ");
		}
		System.out.println();
	}
}
