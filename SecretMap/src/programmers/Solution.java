package programmers;
// 비밀지도, 숫자 암호화, 암호해독
// 한변의 길이가 n 정사각형, 공백 " ", 벽 "#"
// 둘이 같은 자리를 비교했을때 하나라도 벽이면 벽, 모두 공백은 공백
// 정수 배열암호화, 입력값이배열이고
// 정수를 이진수로 바꾸기
// String 
// AI 도움으로 풀음!!!
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 비트 연산 (OR)
            int result = arr1[i] | arr2[i];
            
            // 이진수로 변환하고, 길이를 n에 맞게 맞춤
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(result)).replace(' ', '0');
            
            // 이진수에서 1은 #, 0은 공백으로 변환
            StringBuilder an = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (binaryString.charAt(j) == '1') {
                    an.append("#");
                } else {
                    an.append(" ");
                }
            }
            
            // 결과 배열에 저장
            answer[i] = an.toString();
        }
        
        return answer;
    }
}