package String;

import java.util.Locale;
import java.util.Scanner;

class String_8 {
    public String solution(String s){
        String answer = "NO";
        s= s.toUpperCase().replaceAll("[^A-Z]", ""); //일단 s를 알파벳만 구분으로 작성. 대소문자 구별없이
        //알파벳만 빼고 다 제거해야되니까 replace를 사용하는데 정규식을 사용할 수 있는 replaceAll을 사용.
        //replaceAll("[^A-Z]", "")는 알파벳 대문자가 (^아니면) 다 ""빈문자로 해버려라라는 의미

        String tmp= new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";

        return answer;
    }

    public static void main(String[] args){
        String_8 T = new String_8();
        Scanner kb = new Scanner(System.in);
        String str= kb.nextLine(); //띄어쓰기도 있고 한줄을 읽어야되니까 nextLine을 사용
        System.out.println(T.solution(str));


    }
}
