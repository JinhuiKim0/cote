package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// arr2가 0이 들어가는 것을 확인
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
			arr2[i]=Integer.parseInt(str[i].trim());
		}
		Solution solution=new Solution();
		String[] st = solution.solution(n, arr1, arr2);
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+",");
		}
		// 배열 출력해보기
		for(int i=0;i<n;i++) {
			System.out.println("arr1["+i+"] = "+arr1[i]);
			System.out.println("arr2["+i+"] = "+arr2[i]);
		}
		System.out.println();
	}
}
