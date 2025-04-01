package programmers;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        // 1번 소문자로 바꾸기
        String ID=new_id.toLowerCase();
        System.out.print("1:"+ID+"\n");
        // 2번 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
        String ClearId=ID.replaceAll("[^a-z0-9\\.\\-_]", "");
        System.out.print("2:"+ClearId+"\n");
        // 3번 (.)가 2번 이상 연속된 부분을 하나의 마침표로 치환
        String TransformId=ClearId.replaceAll("\\.{2,}", ".");
        System.out.print("3:"+TransformId+"\n");
        // 4번 new_id에서 마침표가 처음이나 끝에 위치한다면 제거
        String RemoveId=TransformId.replaceAll("(^[\\.]) | ([\\.]$)", "");
        System.out.print("4:"+RemoveId+"\n");
        // 5번 new_id에서 빈 문자열일시, new_id에”a”대입
        if(RemoveId.equals("")) {
        	RemoveId+="a";
        }
        System.out.print("5:"+RemoveId+"\n");
        // 6번 new_id의 길이가 16자 이상일 시, new_id의 첫 15개의 문자를 제외한 나머지 제거,
        if(RemoveId.length()>=16) {
        	RemoveId=RemoveId.substring(0,15); // 0부터 14까지 자르기. 총 15개.
        	// 15번째 문자가 마침표인경우는 제거
        	RemoveId=RemoveId.replaceAll("[\\.]$", "");
        }
        System.out.print("6:"+RemoveId+"\n");
        // 7번 new_id의 길이가 2자 이하, new_id의 마지막 문자를 new_id의 길이가 될때까지 반복
        if(RemoveId.length()<=2) {
        	char c=RemoveId.charAt(RemoveId.length()-1);
        	while(RemoveId.length()==3) {
        		RemoveId+=c;
        	}
        }
        System.out.print("7:"+RemoveId+"\n");
        return RemoveId;
    }
}