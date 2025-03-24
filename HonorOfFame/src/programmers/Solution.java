package programmers;
// 2025.03.23 작성
//점수부여
//지금까지 출연가수 점수들중 k번째 이내이면 명예의 전당 목록
//초기 k일가지는 모두 명예전당
//k=순위, score 사람들의 점수
//순위보다 1개 더 넣고 sort하고 마지막에 저장하고 sort하고 이런식으로 할예정
import java.util.Arrays;
import java.util.Collections;
class Solution {
 public int[] solution(int k, int[] score) {
     int[] result = new int[k+1] {};
     int[] answer=new int[score.length] {};
     result[0]= score[0];
     answer[0]=score[0];
     for(int i=1;i<score.length;i++){
         if(i>=k){ // k보다 넘어서면 계속 k의 위치에 넣고 sort
             result[k]=score[i];
             Arrays.sort(result,Collection.reverseOrder());
             answer[i]=result[k-1];
         }else{ // k보다 넘어서기 전..
             result[i]=score[i]; // 그냥 저장.
             Arrays.sort(result,Collection.reverseOrder()); // k가 3때 배열길이는 4 sort함.
             answer[i]=result[i];
         }
     }
     return answer;
 }
}