package programmers;
// 2025-03-23 작성
//지갑의 크기
//가로 길이w, 세로길이h
//2차원 배열 가로는  세로보다 크게 정렬하면 됨.
//세로의 길이가 가로의 길이보다 커야함 작다면 세로의 길이와 가로의 길이의 위치를 바꿔줌
//다 정렬하고 나면 가로의 길이들을 비교 가장 큰 값 저장, 세로도 마찬가지
//return 값은 최대의 가로세로길이를 곱한 값
class Solution {
 public int solution(int[][] sizes) {
     int answer = 0;
     int max=0;
     int min=0;
     for(int i=0;i<size.length;i++){
         max=Math.max(size[i][0],size[i][1]);
         min=Math.min(size[i][0],size[i][1]);
         size[i][0]=max;
         size[i][1]=min;
     }
     for(int i=0;i<size.length;i++){
         max=Math.max(size[i][0],max); 
         min=Math.max(size[i][1],min);
     }
     answer=max*min;
     return answer;
 }
}
