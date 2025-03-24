package programmers;
//정수 n, n의 약수 모두 더한 값 return
//1) 약수 구하기
//2) 더하기
//1) 예시 12/2=6 
class Solution {
 public int solution(int n) {
     int answer = 0;
     int value=0;
     for(int i=1;i<=Math.sqrt(n);i++){
         value=n%i;
         if(value){
             if(value!=(n/i)){
                 answer=answer+value+(n/i);
             }else if(value==(n/i)){
                 answer+=value;
             }
         }
     }
     return answer;
 }
}