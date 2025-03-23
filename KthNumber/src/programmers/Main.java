package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		var reader=new BufferedReader(new InputStreamReader(System.in));
		String[] input=reader.readLine().trim().split(","); // 공백제거 후 "," 기준으로 배열에 넣기
		int[] array=new int[input.length]; // String배열의 길이만큼 int배열 생성
		for(int i=0;i<input.length;i++) {
			array[i]=Integer.parseInt(input[i]); // String타입 int타입으로 변환
		}
		// [[1,2,3,],[1,2,3]] 이런형식으로 받을 예정 commends 2차원
		String inp=reader.readLine().trim(); // 다음줄 받고 공백제거
		inp = inp.substring(1, inp.length() - 1); // 양쪽 대괄호 제거
		// 제일 바깥 대괄호는 벗김. String배열 생성하서 inp를 ","기준으로 분리한후 다시 []를 없애 배열에 넣기
		String[] Inp=inp.split(",");
		int[][] Commends=new int[Inp.length][3];
		for(int i=0;i<Inp.length;i++) {
			Inp[i]=Inp[i].substring(1,Inp[i].length()-1); // 속에 있는 대괄호 제거
			String[] st;
			st=Inp[i].split(",");
			for(int j=0;j<3;j++) {
				Commends[i][j]=Integer.parseInt(st[j]);
			}
		}
		// 확인을 위한 출력
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println();
		for(int i=0;i<Commends.length;i++) {
			System.out.print("[");
			for(int j=0;j<Commends[i].length;j++) {
				System.out.print(Commends[i][j]+", ");
			}
			System.out.print("] ");
		}
	}
}
