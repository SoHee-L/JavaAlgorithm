package String;

import java.util.Scanner;

class String_11 {
    public String solution(String s){
        String answer = "";
        s=s+" "; //index마지막에 빈문자를 넣어줘야함
        int cnt =1; //cnt는 1로 초기화
        for(int i=0; i<s.length()-1; i++) { //빈문자열 전까지 가야되니 -1을 넣어준다.
            if (s.charAt(i) == s.charAt(i + 1)) cnt++; // s.i지점과 s.i+1이 같으면 cnt 증가
            else {
                answer += s.charAt(i); //answer에 s. i를 누적함.
                if (cnt > 1) answer += String.valueOf(cnt); //1은 그냥 지나가니 1보다 클때만 누적
                cnt = 1; // 그렇게 하고 cnt 다시 1로 초기화
            }
        }
        return  answer;
    }

    public static void main(String[] args){
        String_11 T = new String_11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
