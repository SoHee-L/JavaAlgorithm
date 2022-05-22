package String;

import java.util.Scanner;

class String_7_1 {
    public String solution(String str){
        String answer="NO";
        //대소문자 구분 안하고 뒤집어서 구하기
        String tmp= new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES"; //원래 문자열과 뒤집은 문자열과 같냐라는 의미 /equalsIgnoreCase 대소문자 구분없이 문자열 여부 비교해주는 메서드

        return answer;
    }

    public static void main(String[] args){
        String_7_1 T= new String_7_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
