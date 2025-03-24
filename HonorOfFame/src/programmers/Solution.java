package programmers;
// 2025.03.23 작성
//점수부여
//지금까지 출연가수 점수들중 k번째 이내이면 명예의 전당 목록
//초기 k일가지는 모두 명예전당
//k=순위, score 사람들의 점수

class Solution {
 public int[] solution(int k, int[] score) {
     int[] answer = new int[score.length] {};
     int num=2001; // score의 범위를 넘는 최대값
     answer[0]=; score[0];
     for(int i=1;i<score.length;i++){
         answer[i]=Math.min(score[i],answer[i-1]);
     }
     return answer;
 }
}