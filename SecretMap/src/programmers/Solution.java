// 비밀지도, 숫자 암호화, 암호해독
// 한변의 길이가 n 정사각형, 공백 " ", 벽 "#"
// 둘이 같은 자리를 비교했을때 하나라도 벽이면 벽, 모두 공백은 공백
// 정수 배열암호화, 입력값이배열이고
// 정수를 이진수로 바꾸기
// String 
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n] {};
        for(int i=0;i<n;i++){
            // 비트 연산
            int result=arr1[i] | arr2[i];
            String an="";
            String[] b=Integer.toBinaryString(result);
            for(int j=0;j<n;j++){
                if(b[j].equals("0")){
                    an+=" ";
                }else if(b[j].equals("1")){
                    an+="#";
                }
            }
            answer[i]=an;
        }
        return answer;
    }
}