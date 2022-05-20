package String;

import java.util.Scanner;

class String_2 {
    public String solution(String str){
        String answer="";//answer에 대소문자 변환된것 리턴함
        for(char x:str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x); //isLowerCase는 소문자인지 물어보는 메서드 /toUpperCase는 x를 대문자화 시키는 메서드
            else answer+=Character.toLowerCase(x); //toLowerCase는 x를 소문자화 시키는 메서드
        }
        return answer;
    }
    public static void main(String[] args){
        String_2 T = new String_2();//static넣으면 이렇게 객체생성 필요없다.
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str)); //T.solution해서 문자열을 넘김



    }
}
