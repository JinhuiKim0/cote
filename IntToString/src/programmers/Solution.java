package programmers;

//문자열을 숫자로
//1<=s.length()<=5
//맨앞 부호 올수 있음
//0으로 시작X
//부화와 숫자로 이루어져 있음
class Solution {
 public int solution(String s) {
     int answer = 0;
     
     if(s.charAt(0)=="-"){
         answer=0-Integer.parseInt(s.substring(1,s.length()));
     }else{
         answer=Integer.parseInt(s.substring(1,s.length()));
     }
     return answer;
     
 }
}