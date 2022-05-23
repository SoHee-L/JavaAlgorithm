package String;

import java.util.Scanner;

class String_9 { //아스키넘버로 푼 방법
    public int solution(String s){ //s가 문자와 숫자가 섞여잇는 문자열
        int answer=0;
        for(char x : s.toCharArray()){ //.toCharArray를 해줘야지 문자배열이되서 foreach가 가능하다
            if(x>=48 && x<=57) answer=answer*10+(x-48);//?*10+(x-48)을 해줘야 실제 숫자가 된다.

        }
        return answer;
    }

    public static void main(String[] args){
        String_9 T= new String_9();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution((str)));
    }
}
