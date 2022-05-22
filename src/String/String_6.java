package String;

import java.util.Scanner;

class  String_6 {
public String solution(String str) {
    String answer="";
    for(int i=0; i<str.length(); i++) {
        if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
            //i라는 문자가 처음으로 발견되는 index 번호와 현재그문자의 위치와 같다는 의미 이게 참일때만 answer에 누적하면 된다

    }
    return answer;
}

    public static void main(String[] args) {
        String_6 T = new String_6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
     }
    }
