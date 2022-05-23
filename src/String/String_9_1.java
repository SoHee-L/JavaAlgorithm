package String;

import java.util.Scanner;

class String_9_1 { //String으로 푼방법
    public int solution(String s){ //s가 문자와 숫자가 섞여잇는 문자열
        String answer="";
        for(char x : s.toCharArray()){ //.toCharArray를 해줘야지 문자배열이되서 foreach가 가능하다
            if(Character.isDigit(x)) answer+=x; //isDigit()는 x가 숫자냐라고 물어보는것. 참이면 누적해주면됨.

        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        String_9_1 T= new String_9_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution((str)));
    }
}
